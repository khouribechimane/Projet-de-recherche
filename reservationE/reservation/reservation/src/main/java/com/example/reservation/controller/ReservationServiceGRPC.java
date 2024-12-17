package com.example.reservation.controller;

import com.example.reservation.entity.Reservation;  // Importer l'entité JPA
import com.example.reservation.repository.ReservationRepository;
import com.example.reservation.stubs.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@GrpcService
public class ReservationServiceGRPC extends ReservationServiceGrpc.ReservationServiceImplBase {

    @Autowired
    private ReservationRepository reservationRepository; // Injecter le repository

    @Override
    public void allReservations(GetAllReservationsRequest request, StreamObserver<GetAllReservationsResponse> responseObserver) {
        // Récupérer toutes les réservations depuis la base de données
        List<Reservation> reservations = reservationRepository.findAll();
        GetAllReservationsResponse.Builder responseBuilder = GetAllReservationsResponse.newBuilder();

        // Convertir les entités JPA en objets GRPC
        for (Reservation entity : reservations) {
            com.example.reservation.stubs.Reservation grpcReservation = com.example.reservation.stubs.Reservation.newBuilder()
                    .setId(String.valueOf(entity.getId()))  // Conversion de l'ID en String
                    .setClientId(entity.getClientId())  // Utilisation de Long pour clientId
                    .setChambreId(entity.getChambreId())  // Utilisation de Long pour chambreId
                    .setDateDebut(entity.getDateDebut())
                    .setDateFin(entity.getDateFin())
                    .setPreferences(entity.getPreferences())
                    .build();

            responseBuilder.addReservations(grpcReservation);
        }

        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void reservationById(GetReservationByIdRequest request, StreamObserver<GetReservationByIdResponse> responseObserver) {
        // Recherche une réservation par ID dans la base de données
        Optional<Reservation> reservation = reservationRepository.findById(Long.parseLong(request.getId()));  // Conversion de l'ID
        if (reservation.isPresent()) {
            com.example.reservation.stubs.Reservation grpcReservation = com.example.reservation.stubs.Reservation.newBuilder()
                    .setId(String.valueOf(reservation.get().getId()))  // Conversion de l'ID en String
                    .setClientId(reservation.get().getClientId())  // Utilisation de Long pour clientId
                    .setChambreId(reservation.get().getChambreId())  // Utilisation de Long pour chambreId
                    .setDateDebut(reservation.get().getDateDebut())
                    .setDateFin(reservation.get().getDateFin())
                    .setPreferences(reservation.get().getPreferences())
                    .build();

            responseObserver.onNext(GetReservationByIdResponse.newBuilder().setReservation(grpcReservation).build());
        } else {
            responseObserver.onError(new Throwable("Réservation non trouvée"));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void saveReservation(SaveReservationRequest request, StreamObserver<SaveReservationResponse> responseObserver) {
        // Récupérer les informations de réservation depuis le message GRPC
        com.example.reservation.stubs.ReservationRequest reservationReq = request.getReservation();

        // Créer une nouvelle entité de réservation
        Reservation reservationEntity = new Reservation();
        reservationEntity.setClientId(reservationReq.getClientId());  // Utilisation de Long pour clientId
        reservationEntity.setChambreId(reservationReq.getChambreId());  // Utilisation de Long pour chambreId
        reservationEntity.setDateDebut(reservationReq.getDateDebut());
        reservationEntity.setDateFin(reservationReq.getDateFin());
        reservationEntity.setPreferences(reservationReq.getPreferences());

        // Sauvegarder la réservation dans la base de données
        reservationEntity = reservationRepository.save(reservationEntity);

        // Convertir l'entité en réponse GRPC
        com.example.reservation.stubs.Reservation grpcReservation = com.example.reservation.stubs.Reservation.newBuilder()
                .setId(String.valueOf(reservationEntity.getId()))  // Conversion de l'ID en String
                .setClientId(reservationEntity.getClientId())  // Utilisation de Long pour clientId
                .setChambreId(reservationEntity.getChambreId())  // Utilisation de Long pour chambreId
                .setDateDebut(reservationEntity.getDateDebut())
                .setDateFin(reservationEntity.getDateFin())
                .setPreferences(reservationEntity.getPreferences())
                .build();

        // Répondre avec la réservation sauvegardée
        responseObserver.onNext(SaveReservationResponse.newBuilder().setReservation(grpcReservation).build());
        responseObserver.onCompleted();
    }


    @Override
    public void updateReservation(UpdateReservationRequest request, StreamObserver<UpdateReservationResponse> responseObserver) {
        com.example.reservation.stubs.Reservation reservationReq = request.getReservation();
        Long id = Long.parseLong(reservationReq.getId());

        Optional<Reservation> existingReservation = reservationRepository.findById(id);
        if (existingReservation.isPresent()) {
            Reservation reservationEntity = existingReservation.get();
            reservationEntity.setClientId(reservationReq.getClientId());
            reservationEntity.setChambreId(reservationReq.getChambreId());
            reservationEntity.setDateDebut(reservationReq.getDateDebut());
            reservationEntity.setDateFin(reservationReq.getDateFin());
            reservationEntity.setPreferences(reservationReq.getPreferences());

            reservationEntity = reservationRepository.save(reservationEntity);

            com.example.reservation.stubs.Reservation grpcReservation = com.example.reservation.stubs.Reservation.newBuilder()
                    .setId(String.valueOf(reservationEntity.getId()))
                    .setClientId(reservationEntity.getClientId())
                    .setChambreId(reservationEntity.getChambreId())
                    .setDateDebut(reservationEntity.getDateDebut())
                    .setDateFin(reservationEntity.getDateFin())
                    .setPreferences(reservationEntity.getPreferences())
                    .build();

            responseObserver.onNext(UpdateReservationResponse.newBuilder().setReservation(grpcReservation).build());
        } else {
            responseObserver.onError(new Throwable("Réservation non trouvée pour la mise à jour"));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void deleteReservation(DeleteReservationRequest request, StreamObserver<DeleteReservationResponse> responseObserver) {
        Long id = Long.parseLong(request.getId());

        if (reservationRepository.existsById(id)) {
            reservationRepository.deleteById(id);
            responseObserver.onNext(DeleteReservationResponse.newBuilder().setSuccess(true).build());
        } else {
            responseObserver.onError(new Throwable("Réservation non trouvée pour la suppression"));
        }
        responseObserver.onCompleted();
    }



}

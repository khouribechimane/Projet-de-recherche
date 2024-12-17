package com.example.reservation.controller;

import com.example.reservation.dto.ReservationRequest;
import com.example.reservation.entity.Reservation;

import com.example.reservation.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

@Controller
@AllArgsConstructor
public class ReservationControllerGraphQL {

    private ReservationRepository reservationRepository;

    // Requête: Toutes les réservations
    @QueryMapping
    public List<Reservation> allReservations() {
        return reservationRepository.findAll();
    }

    // Requête: Trouver une réservation par ID
    @QueryMapping
    public Reservation reservationById(@Argument Long id) {
        return reservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reservation not found with ID: " + id));
    }

    // Mutation: Ajouter une réservation



    @MutationMapping
    public Reservation saveReservation(@Argument Reservation reservation){
        return reservationRepository.save(reservation);
    }


    // Mutation: Mettre à jour une réservation

    // Mutation: Mettre à jour une réservation
    // Mutation: Mettre à jour une réservation




    @MutationMapping
    public Reservation updateReservation(
            @Argument Long id,
            @Argument ReservationRequest reservation) { // "reservation" ici au lieu de "reservationRequest"

        // Trouver la réservation existante
        Reservation existingReservation = reservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reservation not found with ID: " + id));

        // Mettre à jour les champs de la réservation
        existingReservation.setClientId(reservation.getClientId());
        existingReservation.setChambreId(reservation.getChambreId());
        existingReservation.setDateDebut(reservation.getDateDebut());
        existingReservation.setDateFin(reservation.getDateFin());
        existingReservation.setPreferences(reservation.getPreferences());

        // Sauvegarder la réservation mise à jour
        return reservationRepository.save(existingReservation);
    }
    // Mutation: Mettre à jour une réservation

    // Mutation: Supprimer une réservation
    @MutationMapping
    public boolean deleteReservation(@Argument Long id) {
        if (reservationRepository.existsById(id)) {
            reservationRepository.deleteById(id);
            return true;
        } else {
            throw new RuntimeException("Reservation not found with ID: " + id);
        }
    }



}

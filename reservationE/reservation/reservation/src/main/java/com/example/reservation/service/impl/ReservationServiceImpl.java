package com.example.reservation.service.impl;

import com.example.reservation.entity.Reservation;
import com.example.reservation.repository.ReservationRepository;
import com.example.reservation.service.ReservationService;
import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@WebService(serviceName = "ReservationService")
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    @WebMethod
    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    @WebMethod
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    @WebMethod
    public Reservation getReservationById(Long id) {
        Optional<Reservation> reservation = reservationRepository.findById(id);
        return reservation.orElse(null);
    }

    @Override
    @WebMethod
    public Reservation updateReservation(Long id, Reservation reservation) {
        if (reservationRepository.existsById(id)) {
            reservation.setId(id);
            return reservationRepository.save(reservation);
        }
        return null;
    }

    @Override
    @WebMethod
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
}
}

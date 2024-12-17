package com.example.reservation.service;

import com.example.reservation.entity.Reservation;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.util.List;

@WebService
public interface ReservationService {

    @WebMethod
    Reservation createReservation(Reservation reservation);

    @WebMethod
    List<Reservation> getAllReservations();

    @WebMethod
    Reservation getReservationById(Long id);

    @WebMethod
    Reservation updateReservation(Long id, Reservation reservation);

    @WebMethod
    void deleteReservation(Long id);
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReservationService.proto

package com.example.reservation.stubs;

public interface GetAllReservationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetAllReservationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Liste de toutes les réservations
   * </pre>
   *
   * <code>repeated .Reservation reservations = 1;</code>
   */
  java.util.List<com.example.reservation.stubs.Reservation> 
      getReservationsList();
  /**
   * <pre>
   * Liste de toutes les réservations
   * </pre>
   *
   * <code>repeated .Reservation reservations = 1;</code>
   */
  com.example.reservation.stubs.Reservation getReservations(int index);
  /**
   * <pre>
   * Liste de toutes les réservations
   * </pre>
   *
   * <code>repeated .Reservation reservations = 1;</code>
   */
  int getReservationsCount();
  /**
   * <pre>
   * Liste de toutes les réservations
   * </pre>
   *
   * <code>repeated .Reservation reservations = 1;</code>
   */
  java.util.List<? extends com.example.reservation.stubs.ReservationOrBuilder> 
      getReservationsOrBuilderList();
  /**
   * <pre>
   * Liste de toutes les réservations
   * </pre>
   *
   * <code>repeated .Reservation reservations = 1;</code>
   */
  com.example.reservation.stubs.ReservationOrBuilder getReservationsOrBuilder(
      int index);
}

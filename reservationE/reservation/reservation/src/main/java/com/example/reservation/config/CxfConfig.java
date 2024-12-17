package com.example.reservation.config;

import com.example.reservation.service.impl.ReservationServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.xml.ws.Endpoint;

@Configuration
public class CxfConfig {

    @Autowired
    private Bus bus;

    @Autowired
    private ReservationServiceImpl reservationService;

    @Bean
    public Endpoint reservationEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, reservationService);
        endpoint.publish("/reservation");
        return endpoint;
}
}

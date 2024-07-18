package com.api.parking_control.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.time.LocalDateTime;


@Entity
@Table(name = "TB_PARKING_SPOT") // creates the table TB_PARKING_SPOT
public class ParkingSpotModel implements Serializable{ //Serializable allow the convetion from java objects to binary for tranference
    private static final long serialVersionUID = 1L; // version identifier for serialization

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // the will be generated automatically
    private UUID id;
    @Column(nullable = false, unique = true, length = 10)
    private String parkinSpotNumber;
    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;
    @Column(nullable = false, length = 70)
    private String brandCar;
    @Column(nullable = false, length = 70)
    private String modelCar;
    @Column(nullable = false, length = 70)
    private String colorCar;
    @Column(nullable = false)
    private LocalDateTime registrationDate;
    @Column(nullable = false, length = 30)
    private String apartament;
    @Column(nullable = false, length = 30)
    private String block;

}

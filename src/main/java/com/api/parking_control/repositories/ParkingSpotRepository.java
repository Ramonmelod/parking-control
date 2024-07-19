package com.api.parking_control.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.parking_control.models.ParkingSpotModel;

@Repository // this annotations must not be here, because the JpaRepository already has this annotation in itself
public interface ParkingSpotRepository extends JpaRepository <ParkingSpotModel, UUID> { // JpaRepository has methods like findAll() and Save()
    
}

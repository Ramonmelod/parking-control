package com.api.parking_control.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;


import com.api.parking_control.models.ParkingSpotModel;
import com.api.parking_control.repositories.ParkingSpotRepository;

import jakarta.transaction.Transactional;

@Service
public class ParkingSpotService {

    final ParkingSpotRepository parkingSpotRepository;
    ParkingSpotService(ParkingSpotRepository parkingSpotRepository){
        this.parkingSpotRepository = parkingSpotRepository;
    }
    @Transactional //this ensures that every transaction will be made in one transaction of database
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel){
        return parkingSpotRepository.save(parkingSpotModel);

    }
    public boolean existsByLicensePlateCar(String licensePlateCar){
        return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);

    }
    public boolean existsByParkingSpotNumber(String ParkingSpotNumber){
        return parkingSpotRepository.existsByParkingSpotNumber(ParkingSpotNumber);

    }
    public boolean existsByApartmentAndBlock(String Apartament, String block){
        return parkingSpotRepository.existsByApartamentAndBlock(Apartament, block );

    }
    public List<ParkingSpotModel> findAll(){
        return parkingSpotRepository.findAll();

    }
    public Optional<ParkingSpotModel> findById(UUID id){
        return parkingSpotRepository.findById(id);
        
    }
    
}

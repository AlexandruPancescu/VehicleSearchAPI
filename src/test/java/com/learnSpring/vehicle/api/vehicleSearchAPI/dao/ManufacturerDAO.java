package com.learnSpring.vehicle.api.vehicleSearchAPI.entity.dao;

import com.learnSpring.vehicle.api.vehicleSearchAPI.entity.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufacturerDAO extends JpaRepository<Manufacturer, Integer> {


}

package com.learnSpring.vehicle.api.vehicleSearchAPI.dao;

import com.learnSpring.vehicle.api.vehicleSearchAPI.entity.ManufacturerYear;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufacturerYearDAO extends JpaRepository<ManufacturerYear, Integer> {
}

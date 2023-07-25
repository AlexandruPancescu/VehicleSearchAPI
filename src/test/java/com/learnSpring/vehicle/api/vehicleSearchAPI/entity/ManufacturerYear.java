package com.learnSpring.vehicle.api.vehicleSearchAPI.entity;


import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="manufacturer_year")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ManufacturerYear {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="manufacturer_year")
    private int year;

}

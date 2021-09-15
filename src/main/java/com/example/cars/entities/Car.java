package com.example.cars.entities;

import javax.persistence.*;

@Entity(name ="car_table")
public class Car{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int carID;

    @Column( columnDefinition = "CHAR(40)",nullable = false)
    private String brand;

    @Column( length =60,nullable = false)
    private String model;

    @Column ( length=60, nullable = false)
    private int pricePerDay;

}
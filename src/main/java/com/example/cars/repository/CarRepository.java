package com.example.cars.repository;

import com.example.cars.entities.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car,Integer> {


}

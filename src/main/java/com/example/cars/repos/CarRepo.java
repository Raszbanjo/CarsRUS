package com.example.cars.repos;

import com.example.cars.entities.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepo extends CrudRepository<Car,Integer> {
}

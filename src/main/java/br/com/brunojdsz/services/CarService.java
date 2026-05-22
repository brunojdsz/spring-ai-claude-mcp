package br.com.brunojdsz.services;

import br.com.brunojdsz.data.Car;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private static final Logger logger = LoggerFactory.getLogger(CarService.class);

    private List<Car> cars = new ArrayList<>();

    @Tool(name = "get_cars", description = "Get a List of cars that Bruno has!")
    public List<Car> getCars(){
        return cars;
    }

    @Tool(name = "get_car", description = "Get a single car by name from Bruno!")
    public Car getCar(String name){
        return cars.stream()
                .filter(car -> car.name().equals(name))
                .findFirst()
                .orElse(null);
    }

    @PostConstruct
    public void init(){
        cars = List.of(
                new Car("Ferrari", "SF90 Stradale", "R$ 4.200.000"),
                new Car("Lamborghini", "Revuelto", "R$ 6.500.000"),
                new Car("Bugatti", "Chiron", "R$ 25.000.000"),

                new Car("BMW", "M3 Competition", "R$ 850.000"),
                new Car("Audi", "RS6 Avant", "R$ 1.300.000"),
                new Car("Porsche", "911 Carrera", "R$ 980.000"),
                new Car("Mercedes-Benz", "C63 AMG", "R$ 950.000"),
                new Car("Toyota", "Corolla GR-S", "R$ 190.000"),
                new Car("Honda", "Civic Touring", "R$ 265.000"),
                new Car("Volkswagen", "Jetta GLI", "R$ 250.000")
        );
    }
}

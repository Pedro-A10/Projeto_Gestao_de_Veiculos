package model.entities.vehicles.dealership;

import model.entities.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Dealership {

    private String name;
    private List<Vehicle> vehicles;

    public Dealership() {
        super();
    }

    public Dealership( String name ) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser nulo.");
        }
        this.name = name;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicles (Vehicle vehicle) {
        if (vehicle == null) {
            throw new IllegalArgumentException("O veículo não pode ser nulo.");
        }
        vehicles.add(vehicle);
    }

    public void removeVehicles (Vehicle vehicle) {
        if (vehicle == null) {
            throw new IllegalArgumentException("O veículo não pode ser nulo.");
        }
        vehicles.remove(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void displayAllVehicles() {
        System.out.println(" === " +name+ " === ");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            System.out.println("-----------------------------");
        }
    }
}

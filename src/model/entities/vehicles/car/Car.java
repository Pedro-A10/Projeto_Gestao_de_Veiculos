package model.entities.vehicles.car;

import model.entities.vehicles.Accessory;
import model.entities.vehicles.Engine;
import model.entities.vehicles.Vehicle;

public class Car extends Vehicle {

    private int numDoors;

    public Car() {
        super();
    }

    public Car( String brand, String model, int year, Engine engine, int numDoors ) {
        super(brand, model, year, engine);
        if (numDoors <= 0) {
            throw new IllegalArgumentException("O Número de portas não pode ser nulo.");
        }
        this.numDoors = numDoors;
    }

    @Override
    public void displayDetails() {
        System.out.println();
        System.out.println("Carro: " + getBrand() + " " + getModel() + " (" + getYear() +")" );
        System.out.println("Numero de portas: " + numDoors);
        System.out.println("Motor: " + getEngine().getPower() + " cavalos," + getEngine().getFuelType() );
        for (Accessory accessory : getAccessories()) {
            System.out.println(" - " + accessory.getName() + " (R$" + accessory.getPrice() + ")");
        }
    }
}

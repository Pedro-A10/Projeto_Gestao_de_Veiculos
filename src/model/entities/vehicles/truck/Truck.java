package model.entities.vehicles.truck;

import model.entities.vehicles.Accessory;
import model.entities.vehicles.Engine;
import model.entities.vehicles.Vehicle;

public class Truck extends Vehicle {

    private double loadCapacity;

    public Truck() {
        super();
    }

    public Truck( String brand, String model, int year, Engine engine, double loadCapacity ) {
        super(brand, model, year, engine);
        if (loadCapacity <= 0) {
            throw new IllegalArgumentException("A capacidade da carga não pode ser 0.");
        }
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Moto: " + getBrand() + " " + getModel() + " (" + getYear() +")" );
        System.out.println("Capacidade de carga: " + loadCapacity);
        System.out.println("Motor: " + getEngine().getPower() + " cavalos," + getEngine().getFuelType() );
        for (Accessory accessory : getAccessories()) {
            System.out.println(" - " + accessory.getName() + " (R$" + accessory.getPrice() + ")");
        }
    }
}

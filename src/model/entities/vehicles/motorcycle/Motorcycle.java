package model.entities.vehicles.motorcycle;

import model.entities.vehicles.Accessory;
import model.entities.vehicles.Engine;
import model.entities.vehicles.Vehicle;

public class Motorcycle extends Vehicle {

    private int displacement;

    public Motorcycle() {
        super();
    }

    public Motorcycle( String brand, String model, int year, Engine engine, int displacement ) {
        super(brand, model, year, engine);
        if (displacement <= 0) {
            throw new IllegalArgumentException("O deslocamento não pode ser 0.");
        }
        this.displacement = displacement;
    }

    @Override
    public void displayDetails() {
        System.out.println();
        System.out.println("Moto: " + getBrand() + " " + getModel() + " (" + getYear() +")" );
        System.out.println("Deslocamento: " + displacement);
        System.out.println("Motor: " + getEngine().getPower() + " cavalos," + getEngine().getFuelType() );
        for (Accessory accessory : getAccessories()) {
            System.out.println(" - " + accessory.getName() + " (R$" + accessory.getPrice() + ")");
            System.out.println();
        }
    }
}

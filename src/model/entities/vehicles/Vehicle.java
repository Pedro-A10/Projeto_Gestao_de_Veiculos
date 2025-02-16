package model.entities.vehicles;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

    private String brand;
    private String model;
    private int year;
    private Engine engine;
    private List<Accessory> accessories;

    public Vehicle() {
    }

    public Vehicle( String brand, String model, int year, Engine engine ) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("A marca não pode ser nulo ou vazio.");
        }
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("O modelo não pode ser nulo ou vazio.");
        }
        if (year <= 0) {
            throw new IllegalArgumentException("Data tem que ser positiva.");
        }
        if (engine == null) {
            throw new IllegalArgumentException("O motor não pode ser nulo.");
        }
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.accessories = new ArrayList<>();
    }

    public void addAccessory ( Accessory accessory ) {
        if (accessory == null) {
            throw new IllegalArgumentException("O Acessório não pode ser nulo.");
        }
        accessories.add(accessory);
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }

    public abstract void displayDetails();
}

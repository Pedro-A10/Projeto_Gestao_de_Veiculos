package model.entities.vehicles;

public class Accessory {

    private String name;
    private double price;

    public Accessory() {
    }

    public Accessory( String name, double price ) {
        if (name == null) {
            throw new IllegalArgumentException("O nome não pode ser nulo.");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("O preço não pode ser menor.");
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

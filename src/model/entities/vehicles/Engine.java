package model.entities.vehicles;

public class Engine {

    private int power;
    private String fuelType;

    public Engine(){
    }

    public Engine( int power, String fuelType ) {
        if (power <= 0) {
            throw new IllegalArgumentException("Potência tem que ser positiva.");
        }
        if (fuelType == null || fuelType.trim().isEmpty()) {
            throw new IllegalArgumentException("O tipo de combustível não pode ser nulo ou vazio.");
        }
        this.power = power;
        this.fuelType = fuelType;
    }


    public int getPower() {
        return power;
    }

    public String getFuelType() {
        return fuelType;
    }
}

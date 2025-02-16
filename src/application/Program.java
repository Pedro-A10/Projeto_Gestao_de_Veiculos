package application;

import model.entities.vehicles.Accessory;
import model.entities.vehicles.Engine;
import model.entities.vehicles.car.Car;
import model.entities.vehicles.dealership.Dealership;
import model.entities.vehicles.motorcycle.Motorcycle;
import model.entities.vehicles.truck.Truck;

public class Program {

    public static void main( String[] args ) {

        //Criando os moteres:
        Engine carEngine = new Engine(200, " Gasolina");
        Engine motorcycleEngine = new Engine(150, " Etanol");
        Engine truckEngine = new Engine(400, " Diesel");

        //Criando os acessórios:
        Accessory soundSystem = new Accessory("Sistema de som", 200.00);
        Accessory allowWheel = new Accessory("Rodas de liga leve", 2000.00);
        Accessory leatherBench = new Accessory("Bancos de couro", 400.00);

        //Criando os veículos:
        Car car = new Car("Ford", "Mustang", 2022, carEngine, 4);
        car.addAccessory(soundSystem);
        car.addAccessory(allowWheel);

        Motorcycle motorcycle = new Motorcycle("Honda", "CBR 600", 2021,motorcycleEngine, 600);
        motorcycle.addAccessory(leatherBench);

        Truck truck = new Truck("Volvo", "FH16", 2020, truckEngine, 5000.0);

        //Criando concessionária e adição de veículos:
        Dealership dealership = new Dealership("Concessionária Central");
        dealership.addVehicles(car);
        dealership.addVehicles(motorcycle);
        dealership.addVehicles(truck);

        //Exibição:
        System.out.println("=== Veículos na Concessionária ===");
        dealership.displayAllVehicles();

    }
}

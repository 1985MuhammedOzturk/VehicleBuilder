/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

public class Lab1 {
/**
 * 
 * @param args 
 */
  public static void main(String[] args) {
    // VehicleManager instance (Singleton)
    VehicleManager manager = VehicleManager.getInstance();

    // Create a car by using the Builder pattern
    Vehicle car = new VehicleDirector(new CarBuilder()).construct();
    manager.addVehicle(car);

    // Create a motorcycle by using the Factory 
    Vehicle motorcycle = VehicleFactory.createVehicle("motorcycle");
    if (motorcycle != null) {
      manager.addVehicle(motorcycle);
    } else {
      System.out.println("Motorcycle creation failed!");
    }

    // Print information about managed vehicles
    System.out.println("Total vehicles: " + manager.getNumberOfVehicles());
    manager.printVehicleDetails();
  }
}

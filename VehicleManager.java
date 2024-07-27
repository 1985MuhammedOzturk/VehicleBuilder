/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;


import java.util.ArrayList;

/**
 * This class is responsible for managing a collection of vehicles
 * VehicleManager class follows the Singleton design.
 * @author moztu
 */
public class VehicleManager {
  private static VehicleManager instance = null;
  private final ArrayList<Vehicle> vehicles;

  /**
   * Initializes the vehicle list.
   */
  private VehicleManager() {this.vehicles = new ArrayList<>();
}

  /**
   * Returns the single instance of VehicleManager
   * @return 
   */
  public static VehicleManager getInstance() {
    if (instance == null) {
      instance = new VehicleManager();
    }
    return instance;
  }
/**
 * adds a vehicle to the list.
 * @param vehicle 
 */
  public void addVehicle(Vehicle vehicle) {
    vehicles.add(vehicle);
  }
/**
 * returns the list.
 * @return 
 */
  public ArrayList<Vehicle> getVehicles() {
    return vehicles;
  }
/**
 * returns the number of vehicle
 * @return 
 */
  public int getNumberOfVehicles() {
    return vehicles.size();
  }
/**
 * prints the details of each vehicle.
 */
  public void printVehicleDetails() {
    for (Vehicle vehicle : vehicles) {
      System.out.println(vehicle);
    }
  }
}

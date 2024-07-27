/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
/**
 * This class is responsible for construction of a vehicle
 * by using Builder design pattern.
 * @author moztu
 */
public class VehicleDirector {
  private VehicleBuilder builder;
/**
 * Constructor for VehicleDirector
 * @param builder 
 */
  public VehicleDirector(VehicleBuilder builder) {
    this.builder = builder;
  }
/**
 * Constructs a vehicle by directing the builder to build vehicle parts.
 * @return 
 */
  public Vehicle construct() {
    builder.buildEngine();
    builder.buildWheels();
    builder.buildDoors();
    return builder.getVehicle();
  }
}

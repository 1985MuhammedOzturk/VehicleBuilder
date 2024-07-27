/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 * MotorcyleBuilder class implements the VehicleBuilder interface
 * to build motorcycle
 * @author moztu
 */
public class MotorcycleBuilder implements VehicleBuilder {

/**
 * setting the engine of the motorcycle
 */
  @Override
  public void buildEngine() {
    motorcycle.setEngine("Motorcycle Engine"); // engine type
  }

  @Override
  public void buildWheels() {
    motorcycle.setWheels(2); //  number of wheels
  }

  @Override
  public void buildDoors() {
    motorcycle.setDoors(0); // no doors on the motorcycle
  }
/**
 * returns the constructed motorcycle
 * @return 
 */
  @Override
  public Vehicle getVehicle() {
    return motorcycle;
  }
/**
 * Motorcycle being constructed
 */
  private final Vehicle motorcycle = new Vehicle(/* ... */) {
      @Override
      public void start() {
          throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      }

      @Override
      public void stop() {
          throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      }
  }; // Use appropriate constructor arguments
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

public class CarBuilder implements VehicleBuilder {
    /**
     * Car being constructed
     */
    private final Vehicle car = new Vehicle("Car Engine", 4, 4) {
      @Override
      public void start() {
          throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      }

      @Override
      public void stop() {
          throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      }
  };

  @Override
  public void buildEngine() {
    car.setEngine("Car Engine");
  }

  @Override
  public void buildWheels() {
    car.setWheels(4);
  }

  @Override
  public void buildDoors() {
    car.setDoors(4);
  }

  @Override
  public Vehicle getVehicle() {
    return car;
  }
}


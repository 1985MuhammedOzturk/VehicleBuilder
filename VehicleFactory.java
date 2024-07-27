/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
/**
 * This class creates instances of different types of vehicles.
 * @author moztu
 */
public class VehicleFactory {
    /**
     * creates a vehicle based on specified type
     * @param type
     * @return 
     */
  public static Vehicle createVehicle(String type) {
     
    if (type.equalsIgnoreCase("car")) {
      return new Vehicle("Car Engine", 4, 4) {
          @Override
          public void start() {
              throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          }

          @Override
          public void stop() {
              throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          }
      };
    } else if (type.equalsIgnoreCase("motorcycle")) {
      return new Vehicle("Motorcycle Engine", 2, 0) {
          @Override
          public void start() {
              throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          }

          @Override
          public void stop() {
              throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          }
      };
    } 

    
    return null;
  }
}

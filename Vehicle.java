/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
/**
 * abstract class for specific types of vehicles.
 * @author moztu
 */
public abstract class Vehicle {
  private String engine;
  private int wheels;
  private int doors;

  /**
   * COnstructor for a vehicle with specific engine, 
   * number of wheels and doors
   * @param engine
   * @param wheels
   * @param doors 
   */
  public Vehicle(String engine, int wheels, int doors) {
    this.engine = engine;
    this.wheels = wheels;
    this.doors = doors;
  }
    public abstract void start();
    public abstract void stop();

    /**
     * Exception throws unsupported operation exception
     */
    Vehicle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
  // Getters and Setters (unchanged)
  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public int getWheels() {
    return wheels;
  }

  public void setWheels(int wheels) {
    this.wheels = wheels;
  }

  public int getDoors() {
    return doors;
  }

  public void setDoors(int doors) {
    this.doors = doors;
  }

  /**
   * Returns a string representation of the vehicle.
   * @return 
   */
  @Override
  public String toString() {
    return "Vehicle{" +
        "engine='" + engine + '\'' +
        ", wheels=" + wheels +
        ", doors=" + doors +
        '}';
  }
}

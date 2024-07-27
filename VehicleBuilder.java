/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
/**
 * Blueprint for building vehicle parts.
 * @author moztu
 */
public interface VehicleBuilder {
    void buildEngine();
    void buildWheels();
    void buildDoors();
    Vehicle getVehicle();
}
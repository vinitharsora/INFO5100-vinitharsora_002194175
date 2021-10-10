/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author vinithiteshharsora
 */
    public class CarHistory { 
        
    private ArrayList<Car> history;
    
    private String date;
    
    public String getDate() {
    return date;
    }

    public void setDate(String date) {
    this.date = date;
}
    
    public CarHistory(){
        
    this.history = new ArrayList<Car>();
    
    }

    public ArrayList<Car> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Car> history) {
        this.history = history;
    }

    public Car addNewCar(){
    
    Car newCar = new Car();
    history.add(newCar);
    return newCar;
        }
    
    public void addNewCar(Car car){
    history.add(car);
    }

    public void deleteCar(Car selectedCar) {
     history.remove(selectedCar);
    } 
    
    }
   

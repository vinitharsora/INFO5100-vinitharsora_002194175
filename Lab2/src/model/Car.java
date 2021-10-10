/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author vinithiteshharsora
 */
public class Car {
 
    private boolean AvailableCar;
    private int CurrentlyAvailableCars;
    private String Manufacturer;
    private int YearOfManufacturing;
    private int MinimumSeats;
    private String SerialNumber;
    private String ModelNumber;
    private String CarManufacturersUsedUber;
//    private int LastTimeFleetlogUpdated;
    private String ListOfCarsAvailableinaGivenCity;
    private boolean ListOfCarsthathaveExpiredMaintenanceCertificate;

    public boolean isAvailableCar() {
        return AvailableCar;
    }

    public void setAvailableCar(boolean AvailableCar) {
        this.AvailableCar = AvailableCar;
    }

    public int getCurrentlyAvailableCars() {
        return CurrentlyAvailableCars;
    }

    public void setCurrentlyAvailableCars(int CurrentlyAvailableCars) {
        this.CurrentlyAvailableCars = CurrentlyAvailableCars;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public int getYearOfManufacturing() {
        return YearOfManufacturing;
    }

    public void setYearOfManufacturing(int YearOfManufacturing) {
        this.YearOfManufacturing = YearOfManufacturing;
    }

    public int getMinimumSeats() {
        return MinimumSeats;
    }

    public void setMinimumSeats(int MinimumSeats) {
        this.MinimumSeats = MinimumSeats;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    public String getModelNumber() {
        return ModelNumber;
    }

    public void setModelNumber(String ModelNumber) {
        this.ModelNumber = ModelNumber;
    }

    public String getCarManufacturersUsedUber() {
        return CarManufacturersUsedUber;
    }

    public void setCarManufacturersUsedUber(String CarManufacturersUsedUber) {
        this.CarManufacturersUsedUber = CarManufacturersUsedUber;
    }

//    public int getLastTimeFleetlogUpdated() {
//        return LastTimeFleetlogUpdated;
//    }
//
//    public void setLastTimeFleetlogUpdated(int LastTimeFleetlogUpdated) {
//        this.LastTimeFleetlogUpdated = LastTimeFleetlogUpdated;
//    }

    public String getListOfCarsAvailableinaGivenCity() {
        return ListOfCarsAvailableinaGivenCity;
    }

    public void setListOfCarsAvailableinaGivenCity(String ListOfCarsAvailableinaGivenCity) {
        this.ListOfCarsAvailableinaGivenCity = ListOfCarsAvailableinaGivenCity;
    }

    public boolean isListOfCarsthathaveExpiredMaintenanceCertificate() {
        return ListOfCarsthathaveExpiredMaintenanceCertificate;
    }

    public void setListOfCarsthathaveExpiredMaintenanceCertificate(boolean ListOfCarsthathaveExpiredMaintenanceCertificate) {
        this.ListOfCarsthathaveExpiredMaintenanceCertificate = ListOfCarsthathaveExpiredMaintenanceCertificate;
    }

    @Override
    
    public String toString(){
    return Manufacturer;
    }
    
}

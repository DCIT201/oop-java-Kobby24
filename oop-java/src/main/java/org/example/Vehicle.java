package org.example;

public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private String make;
    private double baseRentalRate;
    private boolean isAvailable;
    public Vehicle(String vehicleId, String model, String make, double baseRentalRate, boolean isAvailable) {
        try {
            Integer.parseInt(vehicleId);
            this.vehicleId = vehicleId;;
        }catch (NumberFormatException e) {
            System.out.println("Invalid vehicle ID");
        }
        if (model.matches(".*[a-zA-Z].*") || (model.matches(".*\\d.*") && model.matches(".*[a-zA-Z].*"))){
            this.model = model;
        }
        else {
            System.out.println("Invalid model");
        }
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = isAvailable;
        this.make = make;
    }
    public abstract void calculateRentalCost(int days);
    public abstract void isAvailableForRental();
    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }
    public void setBaseRentalRate(double baseRentalRate) {
        this.baseRentalRate = baseRentalRate;
    }
    public boolean getIsAvailable() {
        return isAvailable;
    }
    public void setIsAvailable(boolean available) {
        isAvailable = available;
    }
    public String getMake() {
        return make;
    }
    public void display() {
        System.out.printf("Model: %s\nMake: %s\nRental Rate:%s\n",getModel(),getMake(),getBaseRentalRate());

    }

}


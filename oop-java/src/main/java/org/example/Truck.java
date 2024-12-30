package org.example;

public class Truck extends Vehicle {
    final double maxLoad;

    public Truck(String vehicleId, String model, String make, double baseRentalRate, boolean isAvailable,double maxLoad) {
        super(vehicleId, model, make, baseRentalRate, isAvailable);
        this.maxLoad = maxLoad;
    }

    public void calculateRentalCost(int days) {
        double cost = days * super.getBaseRentalRate();
        System.out.println("Rental cost: " + cost);
    }


    public void isAvailableForRental() {
        if (super.getIsAvailable()){
            System.out.println("Truck is available");
        }
        else {
            System.out.println("Truck is not available");
        }

    }
    public double getMaxLoad() {
        return maxLoad;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Max load: " + getMaxLoad());
    }
}

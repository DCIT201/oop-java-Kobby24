package org.example;

public class Car extends Vehicle {
    final private int sittingCapacity;

    public Car(String vehicleId, String model, String make, double baseRentalRate, boolean isAvailable,int sittingCapacity) {
        super(vehicleId, model, make, baseRentalRate, isAvailable);
        this.sittingCapacity = sittingCapacity;
    }


    public int getSittingCapacity() {
        return sittingCapacity;
    }

    public void calculateRentalCost(int days) {
        double cost = days * super.getBaseRentalRate();
        System.out.println("Rental cost: " + cost);
    }
    public void isAvailableForRental() {
        if (getIsAvailable()){
            System.out.println("Car is available for rental");
        }
        else {
            System.out.println("Car is not available for rental");
        }
    }


    public void display() {
        super.display();
        System.out.println("Sitting Capacity: \n" + sittingCapacity);
    }
}

package org.example;

public class Motorcycle extends Vehicle {
    final private String typeOfMotorcycle;

    public Motorcycle(String vehicleId, String model, String make, double baseRentalRate, boolean isAvailable,String typeOfMotorcycle) {
        super(vehicleId, model, make, baseRentalRate, isAvailable);
        this.typeOfMotorcycle = typeOfMotorcycle;
    }

    public void calculateRentalCost(int days) {
        double cost = days * super.getBaseRentalRate();
        System.out.println("Rental cost: " + cost);
    }


    public void isAvailableForRental() {
        if (super.getIsAvailable()){
            System.out.println("Motorcycle is available for rental");
        }
        else {
            System.out.println("Motorcycle is not available for rental");
        }
    }
    public String getTypeOfMotorcycle() {
        return typeOfMotorcycle;
    }



    public void display() {
        super.display();
        System.out.println("Type: " + typeOfMotorcycle);
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {

    Car mycar = new Car("1","CyberTruck","Tesla",9.2,true,5);
    mycar.display();
    mycar.calculateRentalCost(6);

    Motorcycle myMotor = new Motorcycle("3","X300","BMW",4.5,false,"Sports bike");
    myMotor.display();
    myMotor.calculateRentalCost(5);

    Truck mytruck = new Truck("5","Bongo","KIA",3.5,true,1500.60);
    mytruck.display();
    mytruck.calculateRentalCost(3);


    }

}
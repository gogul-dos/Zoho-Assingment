class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}


class TwoWheeler extends Vehicle {
    public TwoWheeler(String brand, int speed) {
        super(brand, speed);
    }
}


class Bike extends TwoWheeler {
    public Bike(String brand, int speed) {
        super(brand, speed);
    }

    public void bikeFeature() {
        System.out.println(brand + " Bike has a sporty look.");
    }
}


class Scooter extends TwoWheeler {
    public Scooter(String brand, int speed) {
        super(brand, speed);
    }

    public void scooterFeature() {
        System.out.println(brand + " Scooter is easy to ride.");
    }
}


class FourWheeler extends Vehicle {
    public FourWheeler(String brand, int speed) {
        super(brand, speed);
    }
}


class Car extends FourWheeler {
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    public void carFeature() {
        System.out.println(brand + " Car has air conditioning.");
    }
}


class Truck extends FourWheeler {
    public Truck(String brand, int speed) {
        super(brand, speed);
    }

    public void truckFeature() {
        System.out.println(brand + " Truck can carry heavy loads.");
    }
}


public class Q3 {
    public static void main(String[] args) {
        Bike bike = new Bike("Yamaha", 120);
        bike.displayInfo();
        bike.bikeFeature();

        Scooter scooter = new Scooter("Honda", 80);
        scooter.displayInfo();
        scooter.scooterFeature();

        Car car = new Car("Toyota", 180);
        car.displayInfo();
        car.carFeature();

        Truck truck = new Truck("Volvo", 100);
        truck.displayInfo();
        truck.truckFeature();
    }
}

package unit_1;

abstract class ElectricVehicle{
    String name;int range;int capacity;
    public ElectricVehicle(String name, int range, int capacity){
        this.name = name;
        this.range = range;
        this.capacity = capacity;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Range: " + range);
        System.out.println("Capacity: " + capacity);
    }

}

class ElectricScooter extends ElectricVehicle{
    public ElectricScooter(String name, int range, int capacity) {
        super(name, range, capacity);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("This is a Scooter");
    }
}


class ElectricCar extends ElectricVehicle{
    public ElectricCar(String name, int range, int capacity) {
        super(name, range, capacity);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("This is a Car");
    }
}

class ElectricPickupTruck extends ElectricCar{
    public ElectricPickupTruck(String name, int range, int capacity) {
        super(name, range, capacity);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("This is a Pickup Truck");
    }

}
public class TypesOfInheritance {
    public static void main(String[] args) {
        ElectricVehicle vehicle = new ElectricScooter("Ather", 100, 2);
        vehicle.display();
        vehicle = new ElectricCar("Nexon", 200, 4);
        vehicle.display();
        vehicle = new ElectricPickupTruck("CyberTruck", 300, 6);
        vehicle.display();
    }
}

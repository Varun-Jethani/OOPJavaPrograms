package unit_1;

abstract class ElectricVehicle{
    String name;int range;int capacity;
    public ElectricVehicle(String name, int range, int capacity){
        this.name = name;
        this.range = range;
        this.capacity = capacity;
    }

}

class ElectricScooter extends ElectricVehicle{
    public ElectricScooter(String name, int range, int capacity) {
        super(name, range, capacity);
    }
}

class ElectricCar extends ElectricVehicle{
    public ElectricCar(String name, int range, int capacity) {
        super(name, range, capacity);
    }
}

class ElectricPickupTruck{

}
public class TypesOfInheritance {
}

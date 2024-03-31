package unit_1;


class Animal{
    public void makeNoise(){
        System.out.println("Talk");
    }
}

class Dog extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Bark");
    }
}

class Base
{
    public void methodOne()
    {
        System.out.print("A");
        methodTwo();
    }

    public void methodTwo()
    {
        System.out.print("B");
    }
}

class Derived extends Base
{
    public void methodOne()
    {
        super.methodOne();
        System.out.print("C");
    }

    public void methodTwo()
    {
        super.methodTwo();
        System.out.print("D");
    }

    public void methodThree(){
        System.out.print("b");
    }
}

public class ReferenceInterchange {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();

        Dog dog = new Dog();
        dog.makeNoise();

        Animal animalDog = new Dog();
        animalDog.makeNoise();
        if (animal instanceof Animal){
            System.out.println("animal is instance of Animal");
        }
        if (dog instanceof Animal){
            System.out.println("Dog is instance Animal");
        }

        if (animalDog instanceof Animal){
            System.out.println("animalDog is instance Animal");
        }

        if (animal instanceof Dog){
            System.out.println("animal is instance of Dog");
        }

        Base b = new Derived();
        b.methodOne();
        ((Derived) b).methodThree();
    }



}

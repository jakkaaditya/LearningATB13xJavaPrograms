package ex_24_Abstract;

/*1. Animal Sound - Abstract Method Implementation

Description: Create an abstract class Animal with an abstract method makeSound(). Extend it in Dog and Cat.

        🔶 Expected Output:

Dog barks

Cat meows*/


public class Abstract_declaration {

    public static void main(String[] args) {
        Cat ct = new Cat();
        ct.makeSound();
        Dog dg = new Dog();
        dg.makeSound();
    }
}

abstract class  Animal {
    abstract void makeSound();

}

 class Cat extends Animal{

    @Override
    void makeSound() {
        System.out.println("Mamy Mamy");
    }
}

class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Bark Bark");
    }
}






// CLASS
class Car {
    // String brand;
    // String model;
    // int year;

    // public Car(String brand, String model, int year) {
    //     this.brand = brand;
    //     this.model = model;
    //     this.year = year;
    // }

    void beep() {
        System.out.println("Beep beep!");
    }

    // ENCAPSULATION - Binding data and methods that operate on the data within a single unit called class! 
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    

}

// INHERITANCE
class ElectricCar extends Car {
    String batteryType;

    public ElectricCar(String brand, String model, int year, String batteryType) {
        super(brand, model, year);
        this.batteryType = batteryType;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    @Override
    void beep() {
        System.out.println("Beep beep! (Electric)");
    }
}

// // MULTIPLE INHERICANCE! (camera, musicplayer, phone)

// class Camera {
//     void takePicture() {
//         System.out.println("Picture taken!");
//     }
// }

// class MusicPlayer {
//     void playMusic() {
//         System.out.println("Music playing!");
//     }
// }

// class Phone extends Camera, MusicPlayer {
//     void call() {
//         System.out.println("Calling!");
//     }
// }

// METHOD OVERLOADING / COMPILE TIME POLYMORPHISM
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// DYNAMIC POLYMORPHISM / RUNTIME POLYMORPHISM (METHOD OVERRIDING)
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// ABSTRACTION (using classes)
abstract class Vehicle {
    abstract void start();
    abstract void stop();
}


class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike started");
    }

    @Override
    void stop() {
        System.out.println("Bike stopped");
    }
}

// INTERFACE
interface Swimmable {
    void swim();
}
interface Flyable {
    void fly();
}

interface Runable {
    void run();
}

class Duck implements Swimmable, Flyable, Runable {
    @Override
    public void swim() {
        System.out.println("Duck swimming");
    }

    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void run() {
        System.out.println("Duck running");
    }
}

class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish swimming");
    }
}

// STATIC METHOD!
class MathUtils {
    static int add(int a, int b) {
        return a + b;
    }

    static void printMessage() {
        System.out.println("Static Method!");
    }
}






//  OBJECT
public class OOPS{

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2022);
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        car.beep();

        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 2022, "Lithium-ion");
        System.out.println(electricCar.getBrand());
        System.out.println(electricCar.getModel());
        System.out.println(electricCar.getYear());
        System.out.println(electricCar.getBatteryType());
        electricCar.beep();

        // METHOD OVERLOADING
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add(1, 2, 3));
        System.out.println(calculator.add(1.5, 2.5));

        // DYNAMIC POLYMORPHISM
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();

        // DYNAMIC POLYMORPHISM
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1.makeSound();
        animal2.makeSound();

        // ABSTRACTION
        Vehicle vehicle = new Bike();
        vehicle.start();
        vehicle.stop();

        // STATIC METHOD!
        System.out.println(MathUtils.add(1, 2));
        MathUtils.printMessage();
    }
}


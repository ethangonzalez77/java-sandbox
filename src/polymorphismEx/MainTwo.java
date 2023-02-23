package polymorphismEx;

public class MainTwo {

    public static void main(String[] args) {

        // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generice car calss.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).


        Car car = new Car("Basic car", 4);
        System.out.println(car.startCar());
        System.out.println(car.accelerateCar());
        System.out.println(car.stopCar());

        Subaru impereza = new Subaru("Impereza", 4);
        System.out.println(impereza.startCar());
        System.out.println(impereza.accelerateCar());
        System.out.println(impereza.stopCar());

        Honda accord = new Honda("Accord", 4);
        System.out.println(accord.startCar());
        System.out.println(accord.accelerateCar());
        System.out.println(accord.stopCar());

        Ford spark = new Ford("Spark", 4);
        System.out.println(spark.startCar());
        System.out.println(spark.accelerateCar());
        System.out.println(spark.stopCar());

    }
}


class Car {

    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String startCar () {
        return "Car -> startCar()";
    }

    public String accelerateCar() {
        return "Car -> accelerateCar()";
    }

    public String stopCar () {
        return "Car -> stopCar()";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}


class Subaru extends Car {

    public Subaru(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startCar() {
        return "Subaru -> startCar()";
    }

    @Override
    public String accelerateCar() {
        return "Subaru -> accelerateCar()";
    }

    @Override
    public String stopCar() {
        return "Subaru -> stopCar()";
    }
}


class Honda extends Car {

    public Honda(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startCar() {
        return "Honda -> startCar()";
    }

    @Override
    public String accelerateCar() {
        return "Honda -> accelerateCar()";
    }

    @Override
    public String stopCar() {
        return "Honda -> stopCar()";
    }
}


class Ford extends Car {

    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startCar() {
        return getClass().getSimpleName() + " -> startCar()";
    }

    @Override
    public String accelerateCar() {
        return getClass().getSimpleName() + " -> accelerateCar()";
    }

    @Override
    public String stopCar() {
        return getClass().getSimpleName() + " -> stopCar()";
    }
}
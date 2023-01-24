package otherConstructInheritanceSubclassEx.CarEx;

public class ExVehicle {
    public static void main(String[] args) {

        // Challenge.
        // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        // Finally, create another class, a specific type of Car that inherits from the Car class.
        // You should be able to hand steering, changing gears, and moving (speed in other words).
        // You will want to decide where to put the appropriate state and behaviours (fields and methods).
        // As mentioned above, changing gears, increasing/decreasing speed should be included.
        // For you specific type of vehicle you will want to add something specific for that type of car.


        Impereza iz1 = new Impereza(9000);




        System.out.println(iz1.getCurrentVelocity());
        System.out.println(iz1.getCurrentDirection());



//        iz1.accelerate(50);

        System.out.println(iz1.getCurrentVelocity());
        System.out.println(iz1.getCurrentDirection());


        System.out.println("----------------------------------");

        iz1.accelerate(0);
        iz1.accelerate(10);
        iz1.accelerate(20);
        iz1.accelerate(30);
        iz1.accelerate(40);
        iz1.accelerate(900);

        Impereza iz2 = new Impereza(9000);

















    }
}

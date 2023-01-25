package otherConstructInheritanceSubclassEx.CarEx;

public class Vehicle {

    private String name;
    private String size;




    private int currentVelocity;

    private int currentDirection;


    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }





    public void steer (int direction) {

        this.currentDirection = direction;

    }





    public void move (int speed, int direction) {

        this.currentVelocity = speed;//seems to add instead of reassign.🤔
        this.currentDirection = direction;
        System.out.println("velocity: " + currentVelocity + "  direction : " + currentDirection);

    }




    public void stop () {
        System.out.println("The car has stopped.");
        this.currentVelocity = 0;

    }












    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}

package otherConstructInheritanceSubclassEx.CarEx;

public class Impereza extends Car{

    private int roadService;

    public Impereza(int roadService) {
        super("Impereza", "sedan/wagon", 4, 5, 4, false);
        this.roadService = roadService;
    }


    public void accelerate (int currentSpeed) {

        int faster = currentSpeed + getCurrentVelocity();

        if (faster == 0) {

            stop();

        }else if (faster > 0 && faster <=10 ) {
            changeGear(1);
        }else if (faster > 20 && faster <= 30 ) {
            changeGear(2);
        }else if (faster > 30 && faster <= 40) {
            changeGear(3);
        }else if (faster > 40 && faster <= 50) {
            changeGear(4);
        }else if (faster > 50 && faster <= 60) {
            changeGear(5);
        }else if (faster > 60 && faster <= 70) {
            changeGear(6);
        }else if (faster > 70 && faster <= 80) {
            changeGear(7);
        }else if (faster > 80 && faster <= 90) {
            changeGear(8);
        }else if (faster > 90 && faster <= 100) {
            changeGear(9);
        }else {
            System.out.println("Woah gotta go fast!!!!");
        }




        if (faster > 0) {

            changeVelocity(faster, getCurrentDirection());
            System.out.println("This should show if its set up correctly, you should celebrate 🍔🍔🍔🍔🍔");


        }













    }







}

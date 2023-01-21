package otherEx;

import otherEx.Car;

public class CarEx {
    public static void main(String[] args) {

        Car subaru = new Car();
        subaru.model = " Impereza";
        subaru.color = "silver";
//        subaru.year = 2013;


        System.out.println("The first car I bought was a " + subaru.model + " and the color was " + subaru.color);

//      🍔2. now with private fields and getters/setters:

        subaru.setYear(2013);//assign the value
        System.out.println("The year was " + subaru.getYear());//get the value


        subaru.setModel2("ImPereZa");
        System.out.println("The model is... " + subaru.getModel2());


    }
}

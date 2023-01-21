package otherEx;

public class Car {

    public String model;
    public String color;

    private String model2;

    private int year;//🍔1. private fields need getters/setters to let outsider users to have access to this field


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    //Now let's create set/get that work with private fields


    public String getModel2() {
        return model2;
    }

    public void setModel2(String model2) {

        String validInput = model2.toLowerCase();


        if (validInput.equals("impereza") || validInput.equals("crosstrek") || validInput.equals("wrx")) {

            this.model2 = model2;

        }else {
            this.model2 = "Sorry we dont have that car";
        }



    }



}

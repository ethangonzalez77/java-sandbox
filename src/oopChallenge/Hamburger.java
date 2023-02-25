package oopChallenge;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String additionalName1;
    private double additionalPrice1;

    private String additionalName2;
    private double additionalPrice2;

    private String additionalName3;
    private double additionalPrice3;

    private String additionalName4;
    private double additionalPrice4;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }


    public void additionalItem1 (String name, double price) {
        this.additionalName1 = name;
        this.additionalPrice1 = price;
    }
    public void additionalItem2 (String name, double price) {
        this.additionalName2 = name;
        this.additionalPrice2 = price;
    }
    public void additionalItem3 (String name, double price) {
        this.additionalName3 = name;
        this.additionalPrice3 = price;
    }
    public void additionalItem4 (String name, double price) {
        this.additionalName4 = name;
        this.additionalPrice4 = price;
    }


    public double itemizePrice () {
        double hamburgerPrice = this.price;
        System.out.println("Your order is " + this.name + ", " + this.meat + ", " + this.breadRollType + ". price is currently: " + hamburgerPrice);

        if (this.additionalName1 != null) {
            hamburgerPrice += this.additionalPrice1;
            System.out.println(this.additionalName1 + " was added, to the burger, and costs an extra: " + this.additionalPrice1);
        }
        if (this.additionalName2 != null) {
            hamburgerPrice += this.additionalPrice2;
            System.out.println(this.additionalName2 + " was added, to the burger, and costs an extra: " + this.additionalPrice2);
        }
        if (this.additionalName3 != null) {
            hamburgerPrice += this.additionalPrice3;
            System.out.println(this.additionalName3 + " was added, to the burger, and costs an extra: " + this.additionalPrice3);
        }
        if (this.additionalName4 != null) {
            hamburgerPrice += this.additionalPrice4;
            System.out.println(this.additionalName4 + " was added, to the burger, and costs an extra: " + this.additionalPrice4);
        }

        return hamburgerPrice;
    }
}

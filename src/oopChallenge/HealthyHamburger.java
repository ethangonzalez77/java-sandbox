package oopChallenge;

public class HealthyHamburger extends Hamburger {
    private String extraHealthyItem1;
    private double extraHealthyPrice1;

    private String extraHealthyItem2;
    private double extraHealthyPrice2;


    public HealthyHamburger(String meat, double price) {
        super("Healthy Burger", meat, price, "Brown-Rye");
    }


    public void addExtraHealthyItem1(String name, double price) {
        this.extraHealthyItem1 = name;
        this.extraHealthyPrice1 = price;
    }
    public void addExtraHealthyItem2(String name, double price) {
        this.extraHealthyItem2 = name;
        this.extraHealthyPrice2 = price;
    }


    @Override
    public double itemizePrice() {
        return super.itemizePrice();
    }
}
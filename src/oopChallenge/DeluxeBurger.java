package oopChallenge;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe Burger", "Sausage & Bacon", 15.95, "Wheat-bread");
        super.additionalItem1("Chips", 1.50);
        super.additionalItem2("Drink", 1.25);
    }


    @Override
    public void additionalItem1(String name, double price) {
        System.out.println("Can't add any additional items to the Deluxe Burger");
    }
    @Override
    public void additionalItem2(String name, double price) {
        System.out.println("Can't add any additional items to the Deluxe Burger");
    }
    @Override
    public void additionalItem3(String name, double price) {
        System.out.println("Can't add any additional items to the Deluxe Burger");
    }
    @Override
    public void additionalItem4(String name, double price) {
        System.out.println("Can't add any additional items to the Deluxe Burger");
    }
}

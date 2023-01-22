package otherConstructInheritanceSubclassEx.AnimalEx;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, 1, 20);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }


    public void chew() {

        System.out.println("Dogs chew their food");

    }


    public void paws() {

        System.out.println("Dogs move with four paws");

    }



    @Override
    public void eat() {

        chew();
        super.eat();
    }

    @Override
    public void move() {

        paws();
        super.move();
    }







    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public String getCoat() {
        return coat;
    }
}

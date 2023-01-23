package otherConstructInheritanceSubclassEx.AnimalEx;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name,  int gills, int eyes, int fins) {
        super(name, 1, 1, 0, 15);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }


    public void swim () {

        move();
//        super.move();

    }






    @Override
    public void move() {
        System.out.println("Fishes move by swimming 🐠🐠🐠🐠");
    }

    public int getGills() {
        return gills;
    }

    public int getEyes() {
        return eyes;
    }

    public int getFins() {
        return fins;
    }
}

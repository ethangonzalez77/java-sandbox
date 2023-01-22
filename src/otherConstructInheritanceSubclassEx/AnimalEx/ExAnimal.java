package otherConstructInheritanceSubclassEx.AnimalEx;

public class ExAnimal {
    public static void main(String[] args) {


        Dog labadore = new Dog("scotty", 2, 4, 1, 20, "Silk");

        labadore.eat();

        System.out.println("-------------------");

        labadore.move();

        System.out.println("-------------------");


        System.out.println(labadore.getName());
        System.out.println(labadore.getEyes());
        System.out.println(labadore.getLegs());
        System.out.println(labadore.getTail());
        System.out.println(labadore.getTeeth());
        System.out.println(labadore.getCoat());

        System.out.println("-------------------");

        Dog chiwawa = new Dog("lily", 2, 4, 1, 20, "Brown");

        chiwawa.eat();

        System.out.println("-------------------");

        chiwawa.move();

        System.out.println("-------------------");



















    }
}

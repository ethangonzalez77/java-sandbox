package otherConstructInheritanceSubclassEx.VipEx;

public class VipPersonEx {
    public static void main(String[] args) {

        //with an empty constructor
        VipPerson p1 = new VipPerson();

        System.out.println(p1.getName());
        System.out.println(p1.getCreditLimit());
        System.out.println(p1.getEmail());

        System.out.println("-----------------------");

        //now with a constructor that accepts only two arguments but with a default value for the third parameter

        VipPerson p2 = new VipPerson("Vegeta", 797000);

        System.out.println(p2.getName());
        System.out.println(p2.getCreditLimit());
        System.out.println(p2.getEmail());

        System.out.println("-----------------------");

        //now a constructor that has all the arguments

        VipPerson p3 = new VipPerson("Goku", 888000, "goku@gmail.com");

        System.out.println(p3.getName());
        System.out.println(p3.getCreditLimit());
        System.out.println(p3.getEmail());

























    }
}
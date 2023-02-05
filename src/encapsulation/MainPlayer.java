package encapsulation;

public class MainPlayer {

    public static void main(String[] args) {

                //without encapsulation:

//        Player p1 = new Player();
//
//        p1.name = "spongebob";
//        p1.weapon = "spatula";
//
//        System.out.println(p1.health);
//
//
//        p1.damage(98);
//
//        System.out.println(p1.health);
//
//        p1.damage(2);
//
//        p1.health = 44;
//
//        System.out.println(p1.health);


                                    //with encapsulation:


        EnhancedPlayer ep1 = new EnhancedPlayer("Sandy", 89, "sword");

        System.out.println(ep1.getHealth());

        ep1.damageBar(80);
        System.out.println(ep1.getHealth());

        ep1.damageBar(8);
        System.out.println(ep1.getHealth());

        ep1.damageBar(2);
        System.out.println(ep1.getHealth());


















    }
}

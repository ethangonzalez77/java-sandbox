package encapsulation;

public class MainPlayer {

    public static void main(String[] args) {

        Player p1 = new Player();

        p1.name = "spongebob";
        p1.weapon = "spatula";

        System.out.println(p1.health);


        p1.damage(98);

        System.out.println(p1.health);

        p1.damage(2);

        p1.health = 44;

        System.out.println(p1.health);
















    }
}

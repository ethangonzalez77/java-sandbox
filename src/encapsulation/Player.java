package encapsulation;

public class Player {

    public String name;

    public int health = 99;

    public String weapon;



    public void damage (int dam) {

        this.health -= dam;

        if (health < 0) {

            System.out.println("Player knocked out 🥊");

        }

    }



}

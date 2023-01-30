package encapsulation;

public class Player {

    public String name;

    public int healthBar = 99;// was changed to show the flaws of public fields

    public String weapon;



    public void damage (int dam) {

        this.health -= dam;

        if (health < 0) {

            System.out.println("Player knocked out 🥊");

        }

    }



}

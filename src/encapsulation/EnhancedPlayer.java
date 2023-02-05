package encapsulation;

public class EnhancedPlayer {

    private String name;

    private int playerHealth = 2;

    private String weapoooooons;


    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;


        if (health > 0 && health < 95) {

            this.playerHealth = health;

        }


        this.weapoooooons = weapon;
    }



    public void damageBar (int damage) {

        this.playerHealth -= damage;

        if (playerHealth < 0) {

            System.out.println("Yooo, this Player got knocked out");

        }


    }




    public int getHealth() {
        return playerHealth;
    }
}

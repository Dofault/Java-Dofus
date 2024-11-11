package src.model;

public class Player {
    private String pseudo;
    private int health;
    private int attackDamage;
    private Case position;


    public Player(String pseudo, Case position) {
        this.pseudo = pseudo;
        this.position = position;
    }

    private boolean receiveDamage(int damage) {
        this.health-= damage;
        if(health <= 0) {
            return true;
        }
        else
        {
            return false;
        }
    }

    public Case getPosition() {
        return position;
    }

    public boolean attackPlayer(Player p) {
        return p.receiveDamage(p.getAttackDamage());
    }


    public String getPseudo() {
        return pseudo;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setPosition(Case newPosition) {
        this.position = newPosition;
    }


}

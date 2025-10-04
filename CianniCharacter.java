public class CianniCharacter {
    public String name;
    public int health;
    public int stamina;
    public int mana;

    public CianniCharacter(String name) {
        this.name = name;
        this.health = 100;
        this.stamina = 100;
        this.mana = 100;
    }

    public void walk() {
        stamina -= 1;
    }

    public void run() {
        stamina -= 3;
    }

    public void showStats() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Stamina: " + stamina);
        System.out.println("Mana: " + mana);
    }
}
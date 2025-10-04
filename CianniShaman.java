class CianniShaman extends CianniCharacter {

    
    public CianniShaman(String name) {
        super(name);
        this.health = 150;
    }

    
    public void heal() {
        health += 5;
        stamina += 5;
        mana += 5;
    }
}
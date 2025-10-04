public class CianniSwordsman extends CianniCharacter {
    
    public CianniSwordsman (String name) { 
        super (name);
        this.health = 170;
        
    }
    
    public void slash () {
        mana -= 10;
    }
    
     @Override
    public void showStats() {
        System.out.println("I am powerful!");
        super.showStats();
    }
}
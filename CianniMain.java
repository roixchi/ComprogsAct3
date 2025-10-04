public class CianniMain {
public static void main (String [] args) {

    CianniCharacter character = new CianniCharacter("Character"); 
    character.walk();
    character.walk();
    character.walk();
    character.run();
    character.run();
    character.showStats();
    
    
    System.out.println("------------------");
    
    
    CianniShaman shaman = new CianniShaman("Shaman"); 
    shaman.walk();
    shaman.walk();
    shaman.walk();
    shaman.run();
    shaman.run();    
    shaman.heal();
    shaman.showStats();
    
    
    System.out.println("------------------");
     
    CianniSwordsman swordsman = new CianniSwordsman("Swordsman");
    swordsman.walk();
    swordsman.walk();
    swordsman.walk();
    swordsman.run();
    swordsman.run();    
    swordsman.slash();
    swordsman.showStats();
    
    
    System.out.println("------------------");
    
    
    
    
    
    
    
    
    
    
    
}
}
package Strategy_2;

import Strategy_2.character.Character;
import Strategy_2.character.King;
import Strategy_2.character.Knight;
import Strategy_2.character.Queen;
import Strategy_2.character.Troll;
import Strategy_2.weapon.BowAndArrowBehavior;
import Strategy_2.weapon.KnifeBehavior;

public class AdventureGameLauncher {

    public AdventureGameLauncher() {
    }
    
    public static void main(String[] args) {
        AdventureGameLauncher launcher = new AdventureGameLauncher();
        launcher.test();
    }
    
    public void test() {
        Character king1 = new King();
        king1.fight();
        
        Character king2 = new King();
        king2.setWeapon(new BowAndArrowBehavior());
        king2.fight();
        king2.setWeapon(new KnifeBehavior());
        king2.fight();

        Character queen = new Queen();
        queen.setWeapon(new KnifeBehavior());
        queen.fight();
        
        Character troll = new Troll();
        troll.fight();
        
        Character knight = new Knight();
        knight.fight();
    }
}

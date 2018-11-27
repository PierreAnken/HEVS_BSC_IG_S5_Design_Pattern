package Strategy_2.character;

import Strategy_2.weapon.SwordBehavior;

public class Knight extends Character {
    
    public Knight() {
        System.out.println("[Knight]");
        this.setWeapon(new SwordBehavior());
    }
}

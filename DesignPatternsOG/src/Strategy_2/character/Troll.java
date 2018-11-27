package Strategy_2.character;

import Strategy_2.weapon.AxeBehavior;

public class Troll extends Character {
    
    public Troll() {
        System.out.println("[Troll]");
        this.setWeapon(new AxeBehavior());
    }
}

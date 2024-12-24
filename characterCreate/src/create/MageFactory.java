package create;

import product.Character;
import product.Mage;

public class MageFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Mage();
    }
}

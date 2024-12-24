package create;

import create.CharacterFactory;
import product.Character;
import product.Warrior;

public class WarriorFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Warrior();
    }
}

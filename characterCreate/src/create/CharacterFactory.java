package create;

import product.Character;

public abstract class CharacterFactory {
    public abstract Character createCharacter();

    public void create() {
        Character character = createCharacter();
        character.move();
        character.attack();
        character.defend();
        character.draw();
    }
}

import create.CharacterFactory;
import create.MageFactory;
import create.WarriorFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        CharacterFactory factory = new MageFactory();
        factory.create();

    }
}
package product;

public class Warrior implements Character {
    @Override
    public void draw() {
        System.out.println("Drawing a warrior");
    }

    @Override
    public void attack() {
        System.out.println("Warrior is attacking");
    }

    @Override
    public void move() {
        System.out.println("Warrior is moving");
    }

    @Override
    public void defend() {
        System.out.println("Warrior is defending");
    }
}

package product;

public class Mage implements Character {
    @Override
    public void draw() {
        System.out.println("Drawing a mage");
    }

    @Override
    public void attack() {
        System.out.println("Mage is attacking");
    }

    @Override
    public void move() {
        System.out.println("Mage is moving");
    }

    @Override
    public void defend() {
        System.out.println("Mage is defending");
    }
}

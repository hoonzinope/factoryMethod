package product;

public class Archer implements Character {
    @Override
    public void draw() {
        System.out.println("Drawing an archer");
    }

    @Override
    public void attack() {
        System.out.println("Archer is attacking");
    }

    @Override
    public void move() {
        System.out.println("Archer is moving");
    }

    @Override
    public void defend() {
        System.out.println("Archer is defending");
    }
}

package Decorator;

public class Shirt extends Cloth {
    @Override
    public void display() {
        System.out.println("Shirt");
        super.display();
    }
}

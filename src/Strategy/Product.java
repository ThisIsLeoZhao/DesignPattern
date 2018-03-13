package Strategy;

public class Product {
    private int mId;
    private double mPrice;

    Product(int id, double price) {
        mId = id;
        mPrice = price;
    }

    public double getPrice() {
        return mPrice;
    }

    public void setPrice(double price) {
        mPrice = price;
    }
}

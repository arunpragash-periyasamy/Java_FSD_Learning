package Day_3.OOPs.Inheritance;

public class BoxPrice extends BoxWeight {
    float price;

    BoxPrice() {
        price = 0.0f;
    }

    BoxPrice(double length, double breadth, double height, double weight,String string, float price) {
        super(length, breadth, height, weight);
        this.price = price;
    }
    double price() {
        return price;
    }
}

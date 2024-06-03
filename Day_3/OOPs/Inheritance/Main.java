package Day_3.OOPs.Inheritance;

public class Main {
    public static void main(String[] args) {
        BoxColor boxColor = new BoxColor(10.0f, 20.0f, 10, "Yellow");
        System.out.println(boxColor.color + " " + boxColor.height + " " + boxColor.breadth + " " + boxColor.length);

        BoxPrice boxPrice = new BoxPrice(10.0f, 20.0f, 10, 200,"Yellow", 100.0f);
        System.out.println( boxPrice.height + " " + boxPrice.breadth + " " + boxPrice.length + " "
                + boxPrice.price);
        

        Box boxWeight = new BoxWeight(10, 20, 10, 100);
        System.out.println(boxWeight.height + " " + boxWeight.breadth + " " + boxWeight.length + " "
                + boxWeight.volume());
    }
}

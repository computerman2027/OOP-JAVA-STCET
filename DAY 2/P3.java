import java.util.Scanner;

class Box2 {

    double height, width, depth;

    Box2() {
        height = 0;
        width = 0;
        depth = 0;
    }

    double area() {
        return 2 * ((height * width) + (width * depth) + (depth * height));
    }

    double vol() {
        return height * width * depth;
    }

    void setDim(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    void getDim() {
        System.out.println("height : " + height +
                "\nwidth : " + width +
                "\ndepth : " + depth);
    }
}

public class P3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height : ");
        double h = sc.nextDouble();
        System.out.println("Enter width : ");
        double w = sc.nextDouble();
        System.out.println("Enter depth : ");
        double d = sc.nextDouble();
        Box2 b2 = new Box2();

        b2.setDim(h, w, d);
        b2.getDim();

        System.out.println("Area = " + b2.area());
        System.out.println("Volume = " + b2.vol());

        sc.close();
    }
}

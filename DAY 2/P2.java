import java.util.Scanner;

class Box2 {

    double height, width, depth;

    Box2() {
        height = 0;
        width = 0;
        depth = 0;
    }

    Box2(double h) {
        height = h;
        width = h;
        depth = h;
    }

    Box2(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    double area() {
        return 2 * ((height * width) + (width * depth) + (depth * height));
    }

    double vol() {
        return height * width * depth;
    }
}

public class P2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height : ");
        double h = sc.nextDouble();
        System.out.println("Enter width : ");
        double w = sc.nextDouble();
        System.out.println("Enter depth : ");
        double d = sc.nextDouble();

        Box2 b = new Box2(h, w, d);

        System.out.println("Area = " + b.area());
        System.out.println("Volume = " + b.vol());
        Box2 b1 = new Box2(h);

        System.out.println("Area = " + b1.area());
        System.out.println("Volume = " + b1.vol());
        Box2 b2 = new Box2();

        System.out.println("Area = " + b2.area());
        System.out.println("Volume = " + b2.vol());

        sc.close();
    }
}

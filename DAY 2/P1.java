import java.util.Scanner;

class Box {

    double height, width, depth;

    Box(double h, double w, double d) {
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

public class P1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height : ");
        double h = sc.nextDouble();
        System.out.println("Enter width : ");
        double w = sc.nextDouble();
        System.out.println("Enter depth : ");
        double d = sc.nextDouble();

        Box b = new Box(h, w, d);

        System.out.println("Area = " + b.area());
        System.out.println("Volume = " + b.vol());

        sc.close();
    }
}

import java.util.Scanner;

class Box {

    double height, width, depth;

    Box(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }
    public Box() {
        height = 10;
        width = 10;
        depth = 10;
    }

    public Box(Box obj)
    {
        this.height=obj.height;
        this.width=obj.width;
        this.depth=obj.depth;
    }

    double area() {
        return 2 * ((height * width) + (width * depth) + (depth * height));
    }

    double vol() {
        return height * width * depth;
    }
}

public class BoxDemo
{
    public static void main(String[] args) {
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
        Box b2 = new Box();

        System.out.println("Area = " + b2.area());
        System.out.println("Volume = " + b2.vol());
        Box b3 = new Box(b);

        System.out.println("Area = " + b3.area());
        System.out.println("Volume = " + b3.vol());

        sc.close();
    }
}
import java.util.Scanner;

class Complex {
    static int created = 0;
    double real, img;

    public Complex(double real, double img) {
        this.real = real;
        this.img = img;
        created++;
    }

    static Complex add(Complex a, Complex b) {
        double x = a.real + b.real;
        double y = a.img + b.img;
        return new Complex(x, y);
    }

    static Complex sub(Complex a, Complex b) {
        double x = a.real - b.real;
        double y = a.img - b.img;
        return new Complex(x, y);
    }

    static Complex mul(Complex a, Complex b) {
        double w = a.real * b.real;
        double x = a.real * b.img;
        double y = a.img * b.real;
        double z = a.img * b.img;
        return new Complex(w - z, x + y);
    }

    static double modulus(Complex a) {
        return Math.sqrt((a.real * a.real) + (a.img * a.img));
    }

    static Complex complement(Complex a) {
        return new Complex(a.real, a.img * (-1));
    }

    @Override
    public String toString() {
        if(img<0)
        return "" + real + " - " + (img*(-1)) + "i";
        return "" + real + " + " + img + "i";
    }
}

public class ComplexCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double real, img;
        System.out.println("Enter Real part of 1st number");
        real = sc.nextDouble();
        System.out.println("Enter Imaginery part of 1st number");
        img = sc.nextDouble();

        Complex obj1 = new Complex(real, img);
        System.out.println("Enter Real part of 2nd number");
        real = sc.nextDouble();
        System.out.println("Enter Imaginery part of 2nd number");
        img = sc.nextDouble();

        Complex obj2 = new Complex(real, img);

        System.out.println("Complex num 1 = " + obj1);
        System.out.println("Complex num 2 = " + obj2);
        System.out.println("ADD = " + Complex.add(obj1, obj2));
        System.out.println("SUBSTRACTION = " + Complex.sub(obj1, obj2));
        System.out.println("MULTIPLY = " + Complex.mul(obj1, obj2));
        System.out.println("Modulus of num 1 : " + Complex.modulus(obj1));
        System.out.println("Modulus of num 2 : " + Complex.modulus(obj2));

        System.out.println("Complement of num1 : " + Complex.complement(obj1));
        System.out.println("Complement of num2 : " + Complex.complement(obj2));

        System.out.println("Complex no created during execution : " + Complex.created);

    }
}

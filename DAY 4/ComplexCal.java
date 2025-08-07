import java.util.Scanner;

class Complex {
    double real, imaginery;
    
    public Complex(double real, double imaginery)
    {
        this.real = real;
        this.imaginery= imaginery;
    }
    
    static Complex add(Complex a, Complex b)
    {
        double x= a.real + b.real;
        double y= a.imaginery + b.imaginery;

        return new Complex(x, y);
    }
    static Complex sub(Complex a, Complex b)
    {
        double x= a.real - b.real;
        double y= a.imaginery - b.imaginery;

        return new Complex(x, y);
    }
    static Complex mul(Complex a, Complex b)
    {
        double w= a.real * b.real;
        double x= a.real * b.imaginery;
        double y= a.imaginery * b.real;
        double z= a.imaginery * b.imaginery;

        return new Complex(w-z,x+y);
    }

    @Override
    public String toString() {
        return ""+real+" + "+imaginery+"i";
    }

    

}

public class ComplexCal
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double real, img;
        System.out.println("Enter Real part of 1st number");
        real=sc.nextDouble();
        System.out.println("Enter Imaginery part of 1st number");
        img=sc.nextDouble();

        Complex obj1 = new Complex(real, img);
        System.out.println("Enter Real part of 2nd number");
        real=sc.nextDouble();
        System.out.println("Enter Imaginery part of 2nd number");
        img=sc.nextDouble();

        Complex obj2 = new Complex(real, img);

        System.out.println("Complex num 1 = "+ obj1);
        System.out.println("Complex num 2 = "+ obj2);
        System.out.println("ADD = " + Complex.add(obj1, obj2));
        System.out.println("SUBSTRACTION = " + Complex.sub(obj1, obj2));
        System.out.println("MULTIPLY = " + Complex.mul(obj1, obj2));


    }
}

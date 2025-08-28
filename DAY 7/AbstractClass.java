abstract class A1
{
    abstract int calc(int x,int y);

    int square(int x)
    {
        return x*x;
    }
}

class B1 extends A1
{

    @Override
    int calc(int x, int y) {
        return x+y;
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        B1 obj = new B1();
        System.out.println("Calc = "+ obj.calc(5,7));
        System.out.println("Square = "+obj.square(5));

        A1 obj2= new A1() {
            @Override
            int calc(int x, int y) {
                return x*x*y*y;
            }
        };

        System.out.println("Calc = "+ obj2.calc(2,3));

    }
}

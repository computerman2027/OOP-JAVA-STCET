class A
{
    void sum(int a,int b, int c)
    {
        System.out.println("Sum from Super Class = "+(a+b+c));
    }
}

class B extends A
{
    void sum(int a, int b )
    {
        System.out.println("Sum from sub Class = "+(a+b));
    }
}

public class ProveOverloading {
    public static void main(String[] args) {
        B obj = new B();
        obj.sum(2,3);
        obj.sum(2 ,3,9);
    }
}

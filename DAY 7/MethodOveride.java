class A
{
    void display()
    {
        System.out.println("This is Message from Class A");
    }
}

class B extends A
{
    @Override
    void display() {
        System.out.println("This is message from class B");
    }
}

public class MethodOveride {

    public static void main(String[] args) {

        A obj = new A();
        B obj2 = new B();
        A obj3 = new B();

        obj.display();
        obj2.display();
        obj3.display();
    }
}

class X
{
    void display()
    {
        System.out.println("This Message is from cLass A");
    }
}

class Y extends X
{
    @Override
    void display() {
        System.out.println("This message is from class B");
    }
}

class Z extends Y
{
    @Override
    void display() {
        System.out.println("This message is from class C");    }
}


public class DynamicMethodDispatch {
    public static void main(String[] args) {
        X obj1 = new X();
        Y obj2 = new Y();
        Z obj3 = new Z();
        obj1.display();
        obj2.display();
        obj3.display();

        obj1 = new Y();
        obj1.display();
        obj1= new Z();
        obj1.display();

    }
}

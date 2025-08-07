class Outer
{
    int outer_x=100;
    
    void text()
    {
        Inner inner = new Inner();
        inner.display();
    }
    class Inner
    {
        int y;
        void display()
        {
            System.out.println("outer_x = "+outer_x);
        }
    }

    void showY()
    {
        System.out.println("y = " +y);
    }
}

public class InnerClassDemo2 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.text();
    }
     
}
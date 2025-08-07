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
        void display()
        {
            System.out.println("outer_x = "+outer_x);
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.text();
    }
     
}
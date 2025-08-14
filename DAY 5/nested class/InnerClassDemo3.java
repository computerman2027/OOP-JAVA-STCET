class Outer {
    int outer_x = 100;
    int i;

    void text() {
        for ( i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.err.println("interation = "+ i);
                    System.out.println("outer_x = " + outer_x);
                }
            }
            
            Inner inner= new Inner();
            inner.display();
        }
    }

}

public class InnerClassDemo3{
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.text();
    }

}

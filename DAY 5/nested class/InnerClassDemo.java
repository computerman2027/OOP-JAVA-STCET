class Outer {
    int outer_x = 100;

    void text() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    // InnerClassDemo.java:8: error: local variables referenced from an inner class must be final or effectively final
                    // System.err.println("interation = "+ i);
                    System.err.println("interation = "+ i);
                    System.out.println("outer_x = " + outer_x);
                }
            }
            
            Inner inner= new Inner();
            inner.display();
        }
    }

}

public class InnerClassDemo{
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.text();
    }

}
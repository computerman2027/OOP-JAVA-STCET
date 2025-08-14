class Outer {
    int outer_x = 100;

    void text() {
        for (int i = 0; i < 10; i++) {
            final int temp =i;
            class Inner {
                void display() {
                    System.err.println("interation = "+ temp);
                    System.out.println("outer_x = " + outer_x);
                }
            }
            
            Inner inner= new Inner();
            inner.display();
        }
    }

}

public class InnerClassDemo2{
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.text();
    }

}
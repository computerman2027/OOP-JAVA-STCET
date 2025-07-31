class Test{
    int a,b;

    Test(int x, int y)
    {
        a=x;
        b=y;
    }

    public boolean equals(Test obj) {
        if(obj.a ==a && obj.b ==b)
        return false;
        return true;
    }

    @Override
    public String toString() {
        return "Test [a=" + a + ", b=" + b + "]";
    }
    
}


public class TestDemo
{
    public static void main(String[] args) {
        System.out.println();
    }
}

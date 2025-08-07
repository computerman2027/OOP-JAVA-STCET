import java.util.Scanner;

class Point {

    int x,y;

    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    static double distance(Point p1, Point p2)
    {
        return Math.sqrt(Math.pow(p1.x-p2.x,2) + Math.pow(p1.y-p2.y,2));        
    }
}

public class CalDistance 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("Enter first coordinates : ");
        x= sc.nextInt();
        y= sc.nextInt();

        Point obj1 = new Point(x, y);
        
        System.out.println("Enter second coordinates : ");
        x= sc.nextInt();
        y= sc.nextInt();

        Point obj2 = new Point(x, y);

        System.out.println("distance = "+ Point.distance(obj1, obj2));
    }
    
}

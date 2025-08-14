class Car
{
    static
    {
        System.out.println("This is a static block of class Car");
    }

    String carName;

    public Car(String carName)
    {
        this.carName=carName;
    }

    void displayName()
    {
        System.out.println("Car name = " +  carName);
    }
}

public class staticBlockDemonstration {

    public static void main(String[] args) {
        Car obj1= new Car("NANO");
        obj1.displayName();
        Car obj2= new Car("SANTRO");
        obj2.displayName();
        
    }
    
}

import java.util.Scanner;

class Room {
    int length, breadth;

    public Room(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calc_area()
    {
        System.out.println("Room dimension :\nlength = "+length+"  breadth = "+breadth+"\nArea = "+ (length*breadth));
    }
}

class Bedroom extends Room
{
    boolean attachedBathroom,studyTable,nightLamp;

    public Bedroom(int length, int breadth, boolean attachedBathroom, boolean studyTable, boolean nightLamp) {
        super(length, breadth);
        this.attachedBathroom = attachedBathroom;
        this.studyTable = studyTable;
        this.nightLamp = nightLamp;
    }

    void display()
    {
        calc_area();
        System.out.println("attached Bathroom = "+ attachedBathroom+
                "\nStudy table = "+ studyTable+
                "\nNight lamp = "+ nightLamp);
    }
}
class Drawing_room extends Room
{
    boolean sofa, wallCabinet;

    public Drawing_room(int length, int breadth, boolean sofa, boolean wallCabinet) {
        super(length, breadth);
        this.sofa = sofa;
        this.wallCabinet = wallCabinet;
    }

    void display()
    {
        calc_area();
        System.out.println("Sofa = "+sofa+
                "\nWall Cabinet = "+wallCabinet);
    }
}

public class House {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Bedroom details:");
        System.out.print("Length: ");
        int bLength = sc.nextInt();
        System.out.print("Breadth: ");
        int bBreadth = sc.nextInt();

        System.out.print("Attached Bathroom (true/false): ");
        boolean attachedBathroom = sc.nextBoolean();

        System.out.print("Study Table (true/false): ");
        boolean studyTable = sc.nextBoolean();

        System.out.print("Night Lamp (true/false): ");
        boolean nightLamp = sc.nextBoolean();

        Bedroom bedroom = new Bedroom(bLength, bBreadth, attachedBathroom, studyTable, nightLamp);

        System.out.println("\nEnter Drawing Room details:");
        System.out.print("Length: ");
        int dLength = sc.nextInt();
        System.out.print("Breadth: ");
        int dBreadth = sc.nextInt();

        System.out.print("Sofa (true/false): ");
        boolean sofa = sc.nextBoolean();

        System.out.print("Wall Cabinet (true/false): ");
        boolean wallCabinet = sc.nextBoolean();

        Drawing_room drawingRoom = new Drawing_room(dLength, dBreadth, sofa, wallCabinet);

        System.out.println("\n--- Bedroom Info ---");
        bedroom.display();

        System.out.println("\n--- Drawing Room Info ---");
        drawingRoom.display();

        sc.close();
    }
}

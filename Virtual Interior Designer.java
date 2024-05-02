import java.util.ArrayList;
import java.util.List;

// Class to represent a piece of furniture
class Furniture {
    private String name;
    private String type;
    private double width;
    private double length;

    public Furniture(String name, String type, double width, double length) {
        this.name = name;
        this.type = type;
        this.width = width;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}

// Class to represent a room layout
class RoomLayout {
    private List<Furniture> furnitureList;

    public RoomLayout() {
        this.furnitureList = new ArrayList<>();
    }

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }

    public List<Furniture> getFurnitureList() {
        return furnitureList;
    }
}

public class VirtualInteriorDesigner {
    public static void main(String[] args) {
        // Create furniture items
        Furniture sofa = new Furniture("Sofa", "Seating", 2.0, 1.5);
        Furniture table = new Furniture("Coffee Table", "Table", 1.2, 0.8);
        Furniture bed = new Furniture("Bed", "Bedroom", 2.0, 1.8);

        // Create a room layout
        RoomLayout livingRoomLayout = new RoomLayout();
        livingRoomLayout.addFurniture(sofa);
        livingRoomLayout.addFurniture(table);

        RoomLayout bedroomLayout = new RoomLayout();
        bedroomLayout.addFurniture(bed);

        // Display furniture in the room layouts
        System.out.println("Living Room Layout:");
        displayRoomLayout(livingRoomLayout);

        System.out.println("\nBedroom Layout:");
        displayRoomLayout(bedroomLayout);
    }

    public static void displayRoomLayout(RoomLayout roomLayout) {
        List<Furniture> furnitureList = roomLayout.getFurnitureList();
        for (Furniture furniture : furnitureList) {
            System.out.println("Name: " + furniture.getName());
            System.out.println("Type: " + furniture.getType());
            System.out.println("Width: " + furniture.getWidth() + " meters");
            System.out.println("Length: " + furniture.getLength() + " meters");
            System.out.println();
        }
    }
}

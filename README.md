```
# Virtual Interior Designer

This project is a simplified implementation of a virtual interior designer system using Java. It provides basic functionalities for managing furniture items and room layouts, allowing users to visualize and plan interior spaces.

## Features

- **Furniture Management**: Create and manage furniture items with properties such as name, type, width, and length.
- **Room Layout Design**: Define room layouts by adding furniture items to visualize their arrangement and spatial distribution.
- **Basic Console Interface**: Interact with the system through a simple console interface to display furniture and room layouts.

## Usage

1. **Clone the repository:**

   ```bash
   git clone <https://github.com/your-username/virtual-interior-designer.git>

```

1. **Compile and run the Java program:**
    
    ```bash
    cd virtual-interior-designer
    javac VirtualInteriorDesigner.java
    java VirtualInteriorDesigner
    
    ```
    
2. **Interact with the program:**
    - Create furniture items using the `Furniture` class constructor.
    - Create room layouts using the `RoomLayout` class and add furniture items to them.
    - Display the contents of room layouts using the `displayRoomLayout` method.

## Example

```java
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

        System.out.println("\\nBedroom Layout:");
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

```

## Future Enhancements

- **Graphical User Interface (GUI)**: Develop a user-friendly GUI for visualizing and interacting with furniture items and room layouts.
- **3D Rendering**: Implement 3D rendering capabilities to provide realistic visualizations of interior spaces.
- **Advanced Furniture Properties**: Expand the properties of furniture items to include additional attributes such as color, material, and style.

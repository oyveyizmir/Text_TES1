import java.util.ArrayList;

/**
 * Created by PeppaPig on 12/10/2016.
 */
public class Room {
    String name;
    String description;
    ArrayList<Item> items = new ArrayList<Item>();
    Room north;
    Room west;
    Room south;
    Room east;
}

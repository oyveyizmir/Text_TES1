/**
 * Created by PeppaPig on 12/10/2016.
 */
public class Game {
    Room location;
    Player player = new Player();

    Game(){
        Room meadow = new Room();
        meadow.name = "polyana";
        meadow.description = "big meadow where bees and butterflies are flying around";

        Room cave  = new Room();
        cave.name = "peschera trolya";
        cave.description = "you in the darkness, the lights turn on and u see _____INTERNET+TRO_))_LL!";
        Ring ring = new Ring();
        cave.items.add(ring);

        Room wood  = new Room();
        wood.name = "lyes";
        wood.description = "you in the forest. In front sign._Attention computer NERDS!";
        Item potion = new MagicPotion();
        wood.items.add(potion);

        meadow.west=cave;
        meadow.east=wood;

        cave.east=meadow;

        wood.west=meadow;

        location=meadow;
    }

    void goWest()
    {
        location=location.west;
        showLocation();
    }

    void goEast()
    {
        location=location.east;
        showLocation();
    }

    void showLocation()
    {
        System.out.println("U are in " + location.name);
        System.out.println(location.description);
    }

    void look()
    {
        System.out.println("there are in the room:");
        for (Item item : location.items)
            System.out.println(item.name);

        if (location.west == null)
            System.out.println("there is nothing to the west");
        else
            System.out.println("there is " + location.west.name + " to the west");

        if (location.east == null)
            System.out.println("there is nothing to the east");
        else
            System.out.println("there is " + location.east.name + " to the east");
    }

    void take(String name)
    {
        Item item = null;
        for (Item i : location.items){
            if (i.name.equals(name)){
                item = i;
                break;
            }
        }
        if (item == null)
            System.out.println("cannot find " + name + " in the room");
        else {
            location.items.remove(item);
            player.inventory.add(item);
            System.out.println("you have taken " + item.name);
        }
    }
}

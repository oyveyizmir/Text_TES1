/**
 * Created by PeppaPig on 12/10/2016.
 */
import java.util.*;
public class Controller {
    Game game;

    Controller(Game g)
    {
        game = g;
    }

    void play(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welkomen TO +3 31|)3!) 2(!)0!2");
        game.showLocation();

        while (true) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            switch(parts[0]){
                case "exit":
                    return;

                case "west":
                    game.goWest();
                    break;

                case "east":
                    game.goEast();
                    break;

                case "look":
                    game.look();
                    break;

                case "take":
                    if (parts.length < 2 || parts[1] == null || parts[1].equals(""))
                        System.out.println("what do you want to take?");
                    else
                        game.take(parts[1]);
                    break;

            }
        }
    }
}

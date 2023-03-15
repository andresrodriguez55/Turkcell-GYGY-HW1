package simulation;

import entity.Player;
import repository.PlayerRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlayerSimulation
{
    public static void main(String[] args)
    {
        List<Player> database = new ArrayList<>();
        Player player1 = new Player("9876543210", "Andres",
                "Calderon", new Date(), "andres99", 15);
        database.add(player1);

        PlayerRepository repository = new PlayerRepository(database);

        //Get
        System.out.println("Get: " + repository.getById("9876543210"));

        //Update
        player1.setFirstName("Arturo");
        repository.update(player1);
        System.out.println("Get: " + repository.getById("9876543210"));

        //Delete
        repository.delete(repository.getById("9876543210"));
        System.out.println("Deleted: " + repository.getById("9876543210"));
    }
}
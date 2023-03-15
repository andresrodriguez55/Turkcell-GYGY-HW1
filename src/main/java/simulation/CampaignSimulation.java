package simulation;

import entity.Campaign;
import entity.Game;
import repository.CampaignRepository;

import java.util.ArrayList;
import java.util.List;

public class CampaignSimulation
{
    public static void main(String[] args)
    {
        List<Campaign> database = new ArrayList<>();

        List<Game> games1 = new ArrayList<>();
        Game game1 = new Game(1, "Tetris", 15);
        games1.add(game1);
        Game game2 = new Game(2,"Fifa 22", 85);
        games1.add(game2);

        List<Game> games2 = new ArrayList<>();
        games2.add(game2);
        Game game3 = new Game(3,"Mario Bros 2023", 40);
        games2.add(game3);

        Campaign campaign1 = new Campaign(1, games1, 50);
        Campaign campaign2 = new Campaign(2, games2, 70);
        database.add(campaign1);
        database.add(campaign2);

        CampaignRepository repository = new CampaignRepository(database);

        //Get one
        System.out.println("Get: " + repository.getById(1));

        //Get all
        System.out.println("Get All: " + repository.getAll());

        //Update
        campaign1.setPrice(49);
        repository.update(campaign1);
        System.out.println("Update: " + repository.getById(1));

        //Delete
        repository.delete(campaign1);
        System.out.println("Delete: " + repository.getById(1));
    }
}

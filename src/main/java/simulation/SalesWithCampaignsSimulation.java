package simulation;

import entity.*;
import repository.SaleRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesWithCampaignsSimulation
{
    public static void main(String[] args)
    {
        List<Sale> database = new ArrayList<>();

        Player player1 = new Player("9876543210", "Andres",
                "Calderon", new Date(), "andres99",
                17);

        Game game1 = new Game(1,"Tetris", 15.25);
        SaleGame saleGame1 = new SaleGame(1, player1, game1.getPrice(), game1);
        database.add(saleGame1);

        List<Game> games1 = new ArrayList<>();
        Game game2 = new Game(2, "Fifa 2023", 70);
        games1.add(game2);
        Game game3 = new Game(3, "Mario Bros 2022", 50);
        games1.add(game3);
        Campaign campaign1 = new Campaign(1, games1, 80);
        SaleCampaign saleCampaign1 = new SaleCampaign(2, player1,
                                                campaign1.getPrice(), campaign1);
        database.add(saleCampaign1);

        SaleRepository repository = new SaleRepository(database);

        //Get all
        System.out.println("Get all: " + repository.getAll());

        //Update
        saleCampaign1.setAmount(saleCampaign1.getAmount()-10);
        repository.update(saleCampaign1);
        System.out.println("Update: "+repository.getById(saleCampaign1.getId()));

        //Delete
        repository.delete(saleCampaign1);
        System.out.println("Delete: " + repository.getById(saleCampaign1.getId()));
    }
}

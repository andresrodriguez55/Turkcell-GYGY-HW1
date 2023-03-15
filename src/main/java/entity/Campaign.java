package entity;

import entity.common.BaseEntity;

import java.util.List;

public class Campaign extends BaseEntity<Integer>
{
    private List<Game> games;
    private double price;

    public Campaign(Integer id, List<Game> games, double price)
    {
        super(id);
        this.games = games;
        this.price = price;
    }

    public List<Game> getGames()
    {
        return games;
    }

    public void setGames(List<Game> games)
    {
        this.games = games;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Campaign{" +
                "games=" + games +
                ", price=" + price +
                "} " + super.toString();
    }
}

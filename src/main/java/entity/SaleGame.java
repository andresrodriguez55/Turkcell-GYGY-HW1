package entity;

public class SaleGame extends Sale
{
    private Game game;

    public SaleGame(Integer id, Player isFor, double amount, Game game)
    {
        super(id, isFor, amount);
        this.game = game;
    }

    public Game getGame()
    {
        return game;
    }

    public void setGame(Game game)
    {
        this.game = game;
    }

    @Override
    public String toString()
    {
        return "SaleGame{" +
                "game=" + game +
                "} " + super.toString();
    }
}

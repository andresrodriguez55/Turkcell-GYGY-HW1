package entity;

import entity.common.BaseEntity;

public class Game extends BaseEntity<Integer>
{
    private String name;
    //category??
    private double price;

    public Game(Integer id, String name, double price)
    {
        super(id);
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
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
        return "Game{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

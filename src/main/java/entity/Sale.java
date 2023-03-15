package entity;

import entity.common.BaseEntity;

public class Sale extends BaseEntity<Integer>
{
    private Player isFor;
    private double amount;

    public Sale(Integer id, Player isFor, double amount)
    {
        super(id);
        this.isFor = isFor;
        this.amount = amount;
    }

    public Player getIsFor()
    {
        return isFor;
    }

    public void setIsFor(Player isFor)
    {
        this.isFor = isFor;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    @Override
    public String toString()
    {
        return "Sale{" +
                "isFor=" + isFor +
                ", amount=" + amount +
                "} " + super.toString();
    }
}

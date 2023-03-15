package entity;

import java.util.Date;

public class Player extends Citizen
{
    private String nickname;
    private double amount;
    // private List<Sale> sales; //unidirectional

    public Player(String id, String firstName, String lastName, Date birthdate, String nickname, double amount)
    {
        super(id, firstName, lastName, birthdate);
        this.nickname = nickname;
        this.amount = amount;
    }

    public String getNickname()
    {
        return nickname;
    }

    public void setNickname(String nickname)
    {
        this.nickname = nickname;
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
        return "Player{" +
                "nickname='" + nickname + '\'' +
                ", amount=" + amount +
                "} " + super.toString();
    }
}

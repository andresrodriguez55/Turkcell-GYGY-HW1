package entity;

import entity.common.BaseEntity;

import java.util.Date;

public class Player extends BaseEntity<Integer>
{
    private String identityNumber;
    private String firstName;
    private String lastName;
    private Date birthdate;
    private String nickname;
    private double amount;
    // private List<Sale> sales; //unidirectional


    public Player(Integer id, String identityNumber, String firstName, String lastName, Date birthdate, String nickname, double amount)
    {
        super(id);
        this.identityNumber = identityNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.nickname = nickname;
        this.amount = amount;
    }

    public String getIdentityNumber()
    {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber)
    {
        this.identityNumber = identityNumber;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public Date getBirthdate()
    {
        return birthdate;
    }

    public void setBirthdate(Date birthdate)
    {
        this.birthdate = birthdate;
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
                "identityNumber='" + identityNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdate=" + birthdate +
                ", nickname='" + nickname + '\'' +
                ", amount=" + amount +
                "} " + super.toString();
    }

}

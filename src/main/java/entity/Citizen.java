package entity;

import entity.common.BaseEntity;

import java.util.Date;

public class Citizen extends BaseEntity<String>
{
    private String firstName;
    private String lastName;
    private Date birthdate;

    public Citizen(String id, String firtName, String lastName, Date birthdate)
    {
        super(id);
        this.firstName = firtName;
        this.lastName = lastName;
        this.birthdate = birthdate;
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

    @Override
    public String toString()
    {
        return "Citizen{" +
                "firtName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdate=" + birthdate +
                "} " + super.toString();
    }
}

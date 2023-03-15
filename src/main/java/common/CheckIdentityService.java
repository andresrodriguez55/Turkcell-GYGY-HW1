package common;

import entity.Player;

import java.util.ArrayList;
import java.util.List;

public class CheckIdentityService
{
    private Player player;
    private List<String> identityNumbers;

    public CheckIdentityService(Player player)
    {
        this.player = player;

        //initialize records of identity numbers
        identityNumbers = new ArrayList<>();
        identityNumbers.add("9876543210");
        identityNumbers.add("5555555555");
        identityNumbers.add("1234567890");
    }

    public boolean validate()
    {
        for(String identityNumber : identityNumbers)
        {
            if(player.getIdentityNumber().equals(identityNumber))
            {
                return true;
            }
        }
        return false;
    }
}

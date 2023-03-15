package entity;

public class SaleCampaign extends Sale
{
    Campaign campaign;

    public SaleCampaign(Integer id, Player isFor, double amount, Campaign campaign)
    {
        super(id, isFor, amount);
        this.campaign = campaign;
    }

    public Campaign getCampaign()
    {
        return campaign;
    }

    public void setCampaign(Campaign campaign)
    {
        this.campaign = campaign;
    }

    @Override
    public String toString()
    {
        return "SaleCampaign{" +
                "campaign=" + campaign +
                "} " + super.toString();
    }
}

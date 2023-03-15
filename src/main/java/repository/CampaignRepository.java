package repository;

import entity.Campaign;
import repository.common.ListRepository;

import java.util.List;

public class CampaignRepository extends ListRepository<Campaign, Integer>
{
    public CampaignRepository(List<Campaign> database)
    {
        super(database);
    }
}

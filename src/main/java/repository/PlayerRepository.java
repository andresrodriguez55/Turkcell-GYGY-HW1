package repository;

import entity.Player;
import repository.common.ListRepository;

import java.util.List;

public class PlayerRepository extends ListRepository<Player, Integer>
{
    public PlayerRepository(List database)
    {
        super(database);
    }
}

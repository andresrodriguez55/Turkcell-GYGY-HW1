package repository;

import entity.Sale;
import repository.common.ListRepository;

import java.util.List;

public class SaleRepository extends ListRepository<Sale, Integer>
{
    public SaleRepository(List<Sale> database)
    {
        super(database);
    }
}

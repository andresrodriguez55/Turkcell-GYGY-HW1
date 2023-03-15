package repository.common;

import entity.common.BaseEntity;

import java.util.List;

public class ListRepository<T extends BaseEntity<PK>, PK extends Object> implements GenericRepository<T, PK>
{
    private List<T> database;
    public ListRepository(List<T> database)
    {
        this.database = database;
    }

    @Override
    public T getById(PK id)
    {
        for(T entity : database)
        {
            if(entity.getId().equals(id))
            {
                return entity;
            }
        }
        return null;
    }

    @Override
    public void create(T entity)
    {
        database.add(entity);
    }

    @Override
    public void update(T entity)
    {
        for(int x=0; x<database.size(); x++)
        {
            T dbEntity = database.get(x);
            if(dbEntity.getId().equals(entity.getId()))
            {
                database.set(x, entity);
                return;
            }
        }
    }

    @Override
    public void delete(T entity)
    {
        for(int x=0; x<database.size(); x++)
        {
            T dbEntity = database.get(x);
            if(dbEntity.getId().equals(entity.getId()))
            {
                database.remove(x);
                return;
            }
        }
    }

    @Override
    public List<T> getAll()
    {
        return database;
    }
}

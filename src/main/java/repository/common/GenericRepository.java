package repository.common;

import entity.common.BaseEntity;

import java.util.List;

public interface GenericRepository<T extends BaseEntity<PK>, PK extends Object> // T, S multiple generics
{
    T getById(PK id);
    void create(T entity);
    void update(T id);
    void delete(T entity);
    List<T> getAll();
}

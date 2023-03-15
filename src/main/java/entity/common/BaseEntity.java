package entity.common;

public class BaseEntity<T>
{
    private T id;

    public BaseEntity(T id)
    {
        this.id = id;
    }

    public T getId()
    {
        return id;
    }

    public void setId(T id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "BaseEntity{" +
                "id=" + id +
                '}';
    }
}

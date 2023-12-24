package training.dao;

import java.util.List;

public interface Dao<T> {
    List<T> getAll();

    T get(long id);

    void save(T object);

    void update(T t);

    void delete(T t);
}

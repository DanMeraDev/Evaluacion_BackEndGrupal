package Dao;
import java.util.List;

public interface iDao<T> {
    T guardar(T t);
    void buscarTodos();
}

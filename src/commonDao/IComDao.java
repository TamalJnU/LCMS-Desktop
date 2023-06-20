package commonDao;

import java.util.List;

public interface IComDao<T> {
    public int save(T t);
    public int update(T t);
    public int delete(int id);
    public List<T> getAll();
}

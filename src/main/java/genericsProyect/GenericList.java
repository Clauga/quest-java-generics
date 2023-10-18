package genericsProyect;

import java.util.ArrayList;
import java.util.List;

public class GenericList<T> {
    private List<T> items;
    public GenericList() {
        items = new ArrayList<T>();
    }
    public void add(T item) {
        items.add(item);
    }
    public T get(int index) {
        return items.get(index);
    }
    public int size() {
        return items.size();
    }

}

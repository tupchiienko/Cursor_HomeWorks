package homework4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyList<T extends Comparable<T>> {
    private final ArrayList<T> list;

    public MyList() {
        this.list = new ArrayList<>();
    }

    public MyList(T[] array) {
        this.list = new ArrayList<>(List.of(array));
    }

    public ArrayList<T> getList() {
        return list;
    }

    public void add(T element) {
        list.add(element);
    }

    public T highest() {
        return list.stream().sorted().collect(Collectors.toList()).get(list.size() - 1);
    }

    public T lowest() {
        return list.stream().sorted().collect(Collectors.toList()).get(0);
    }
}

package homework4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyList<T extends Comparable<T>> {
    private final ArrayList<T> list;

    public MyList() {
        this.list = new ArrayList<>();
    }

    public MyList(T[] array) {
        this.list = new ArrayList<>(List.of(array));
    }

    public void add(T element) {
        list.add(element);
    }

    public T highest() {
        return list.stream().max(Comparator.naturalOrder()).orElseThrow(() -> new EmptyListException("List is empty"));
    }

    public T lowest() {
        return list.stream().min(Comparator.naturalOrder()).orElseThrow(() -> new EmptyListException("List is empty"));
    }

    @Override
    public String toString() {
        return "MyList{" + list + '}';
    }
}

package homework7.task3;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class PersonCollector implements Collector<String, List<String>, List<Person>> {

    private PersonCollector() {
    }

    public static PersonCollector getInstance() {
        return new PersonCollector();
    }

    @Override
    public Supplier<List<String>> supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<String>, String> accumulator() {
        return (List::add);
    }

    @Override
    public BinaryOperator<List<String>> combiner() {
        return ((strings, strings2) -> {
            strings.addAll(strings2);
            return strings;
        });
    }

    @Override
    public Function<List<String>, List<Person>> finisher() {
        return strings -> {
            if (strings.size() % 2 != 0) {
                throw new IllegalArgumentException("Strings count must be even.");
            }
            List<Person> personList = new ArrayList<>();
            for (int i = 0; i < strings.size(); i += 2) {
                personList.add(new Person(strings.get(i), strings.get(i + 1)));
            }
            return personList;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        return EnumSet.of(Characteristics.CONCURRENT);
    }
}

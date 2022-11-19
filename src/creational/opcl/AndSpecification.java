package creational.opcl;

import java.util.List;
import java.util.stream.Collectors;

public class AndSpecification <T> implements Specification <T>{

    private final List<Specification<T>> specifications;

    public AndSpecification(Specification<T> ... spec) {
        specifications = List.of(spec);
    }

    @Override
    public boolean isSatisfied(T item) {
        List<Specification<T>> collect = specifications.stream()
            .filter(specifications -> specifications.isSatisfied(item))
            .collect(Collectors.toList());
        return collect.size() == specifications.size();
    }
}

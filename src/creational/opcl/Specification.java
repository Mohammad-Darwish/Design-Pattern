package creational.opcl;

public interface Specification<T> {
    boolean isSatisfied(T item);
}

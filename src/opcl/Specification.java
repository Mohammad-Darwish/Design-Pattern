package opcl;

public interface Specification<T> {
    boolean isSatisfied(T item);
}

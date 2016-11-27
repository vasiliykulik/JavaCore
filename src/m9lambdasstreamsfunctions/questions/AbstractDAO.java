package src.m9lambdasstreamsfunctions.questions;

public interface AbstractDAO<T> {
    T save(T t);

    //T get(long id);
}

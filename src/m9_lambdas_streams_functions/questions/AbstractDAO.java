package src.m9_lambdas_streams_functions.questions;

public interface AbstractDAO<T> {
    T save(T t);

    //T get(long id);
}

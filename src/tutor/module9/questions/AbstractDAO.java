package src.tutor.module9.questions;

public interface AbstractDAO<T> {
    T save(T t);

    //T get(long id);
}

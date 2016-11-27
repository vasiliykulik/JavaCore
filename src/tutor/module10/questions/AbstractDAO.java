package src.tutor.module10.questions;

public interface AbstractDAO<T> {

    T save(T t);

    //delete

    T findById(long id);
}

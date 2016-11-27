package src.m8_map_generics.homework8_dao_generic;

/**
 * Created by Raketa on 19.10.2016.
 */
public interface Id<T>{
    T getById(long id);
}

package src.m8_map_generics.question_answer;

/**
 * Created by Стрела on 11.10.2016.
 */
public class TwoGenericExample<T extends User, K> {
    T save(T t){
        return t;
    }

    T delete(T t){
        return t;
    }
    K save(K k){
        return k;
    }
}

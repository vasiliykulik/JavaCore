package src.m8_map_generics.test_questions;

import java.util.Stack;

/**
 * Created by Стрела on 11.10.2016.
 */
public class genericstack <E>{
    Stack <E> stk = new Stack<E>();
    public void push(E obj){
        stk.push(obj);
    }
    public E pop(){
        E obj = stk.pop();
        return obj;
    }
}

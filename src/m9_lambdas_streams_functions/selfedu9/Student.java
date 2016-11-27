package src.m9_lambdas_streams_functions.selfedu9;

/**
 * Created by Raketa on 19.10.2016.
 */
import java.util.function.Function;
public class Student {
    public String name;
    public int age;
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public  String customShow(Function<Student,String> fun){
        return fun.apply(this);
    }
}

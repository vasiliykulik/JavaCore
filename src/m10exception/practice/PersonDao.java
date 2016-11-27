package src.m10exception.practice;

import java.util.List;

public interface PersonDao {

  Person save(Person person);
  
  Person findByEmail(String email);

  List<Person> get();

}

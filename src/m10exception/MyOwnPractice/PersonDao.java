package src.m10exception.MyOwnPractice;



public interface PersonDao {

  Person save(Person person);

  Person findByEmail(String email);

}

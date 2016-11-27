package src.m10exception.practice;

import src.m10exception.MyOwnPractice.Person;
import src.m10exception.MyOwnPractice.PersonDAOImpl;
import src.m10exception.MyOwnPractice.PersonDao;

import java.util.Map;

/**
 * Created by Стрела on 24.10.2016.
 */
public class PersonController1 {
    private static PersonDao personDao = new PersonDAOImpl();

    public String save(Map<String, String> requestParams) throws PersonException {
        if (!requestParams.containsKey("firstName")) {
            throw new PersonException("Отсутствует обязательный параметр\"Имя\"");
        }
        if (!requestParams.containsKey("email")) {
            throw new PersonException("Отсутствует обязательный параметр\"Email\"");
        }
        final String firstName = requestParams.get("firstName");
        final String email = checkForNull(requestParams,"email");

        final String lastName = checkForNull(requestParams, "");

        src.m10exception.MyOwnPractice.Person person = new Person(firstName, lastName, email);

        personDao.save(person);

        return person.toString();
    }

    private String checkForNull(Map<String, String> requestParams, String param) {
        String res;
        if (requestParams.get("lastName") != null) {
            res = requestParams.get("lastName");
        } else {
            res = ""; // что бы не было constrains от SQL - то мы null обернем в String
        }
        return res;
    }

    public static PersonDao getPersonDao() {
        return personDao;
    }
}


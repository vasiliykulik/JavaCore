package src.m10exception.qa_to_map_delete_fr_list;

import src.tutor.sn.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Стрела on 26.10.2016.
 * toMap - из структуры данных делает Map по заданным правилам
 *
 */
public class QuestionToMapCollectors {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Denis", "1001"));
        userList.add(new User("Taras", "1002"));
        userList.add(new User("Nina", "1003"));

        userList.stream()
                /*
                У Map может быть любой тип и задаваться динамически
                 */
                .collect(Collectors.toMap(User::getId,User::getFirstName));
    }
}

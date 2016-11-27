package src.m6staticfinal.homework_m6;

/**
 * Created by Raketa on 19.09.2016.
 */
public class UserUtils {
    public static User[] uniqueUsers(User[] user) {
// если на вход приходят null, некоторые методы не работают, потому пропускаю входные массивы через deleteEmptyUsers
        int end = deleteEmptyUsers(user).length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (deleteEmptyUsers(user)[i].equals(deleteEmptyUsers(user)[j])) {
                    int shift = j;
                    for (int k = j + 1; k < end; k++, shift++) {
                        deleteEmptyUsers(user)[shift] = deleteEmptyUsers(user)[k];
                    }
                    end--;
                    j--;
                }
            }
        }
        User[] result = new User[end];
        for (int i = 0; i < end; i++) {
            result[i] = deleteEmptyUsers(user)[i];
        }
        return result;
    }

    public static User[] userWithConditionalBalance(User[] user, int balance) {// тут я не понял что за баланс принимаем - передам 0
        for (User eachuser : deleteEmptyUsers(user)) {
            balance += eachuser.getBalance();
        }
        User[] userWithConditionalBalance = new User[1];
        userWithConditionalBalance[0] = new User(0, "userWith", "ConditionalBalance", 0, balance);
        return userWithConditionalBalance;
    }

    public final static User[] paySalaryToUsers(User[] user) {
        for (User eachuser : deleteEmptyUsers(user)) {
            eachuser.setBalance(eachuser.getBalance() + eachuser.getSalary());
        }
        return deleteEmptyUsers(user);
    }

    public final static long[] getUsersId(User[] user) {
        long[] userId = new long[deleteEmptyUsers(user).length];
        for (int i = 0; i < deleteEmptyUsers(user).length; i++) {
            userId[i] = deleteEmptyUsers(user)[i].getId();
        }
        return userId;
    }

    public static User[] deleteEmptyUsers(User[] user) {
        // if any instance of user is null OR if any field of the object is null for string or 0 for primitives, except balance
        int end = user.length;

        for (int i = 0; i < end; i++)
            if ((user[i] == null) ||
                    (user[i].getId() == 0 || user[i].getSalary() == 0 || user[i].getFirstName() == null || user[i].getLastName() == null)) {
                int shift = i;
                for (int j = i + 1; j < end; shift++, j++) {
                    user[shift] = user[j];
                }
                end--;// уменьшаем рассматриваемый фрагмент массива до рабочей зоны (дубликаты остаются в конце)
                i--;// элементу где был null уже присвоен следующий элемент потому возвращаемся к нему и отправляем на проверку
            }

        User[] result = new User[end];
        for (int i = 0; i < end; i++) {
            result[i] = user[i];
        }

        return result;
    }

}

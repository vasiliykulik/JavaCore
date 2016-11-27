package src.m6staticfinal.homework_m6;

/**
 * Created by Raketa on 19.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        User[] user = new User[7];
        user[0] = new User(1, "John", " Smith", 355, 1200);
        user[4] = new User(1, "John", " Smith", 354, 1200);
        user[2] = new User(3, "John2", " Smith3", 353, 1200);
        user[3] = new User(4, "John3", " Smith4", 352, 1200);
        user[1] = new User(1, "John", " Smith", 351, 1200);
        user[5] = null;
        user[6] = new User(1, null, " Smith", 111, 1200);


        for (User each : UserUtils.uniqueUsers(user)) {
            System.out.println(each);
        }
        System.out.println();
        for (User each : UserUtils.userWithConditionalBalance(user, 0)) {
            System.out.println(each);
        }
        System.out.println();
        for (User each : UserUtils.paySalaryToUsers(user)) {
            System.out.println(each);
        }
        System.out.println();
        for (long each : UserUtils.getUsersId(user)) {
            System.out.println(each);
        }
        System.out.println();
        for (User eachuser : UserUtils.deleteEmptyUsers(user)) {
            System.out.println(eachuser);
        }
    }
}

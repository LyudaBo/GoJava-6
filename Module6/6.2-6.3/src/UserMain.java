/**
 * Created by Людмила on 13.03.2017.
 */
public class UserMain {
    //Создайте класс UsersMain с методом main,
    // где создайте несколько тестовых пользователей  и продемонстрируйте, как работает каждый метод из UserUtils.

    public static void main(String[] args) {
        User user1 = new User(1, "Max", "Nor", 100, 20000);
        User user2 = new User(2, "Alex", "Bor", 10000, 20000);
        User user3 = new User(3, "Max", "Gor", 100000, 10000);
        User user4 = new User(1, "Max", "Nor", 1000, 20000);

        User[] users = new User[4];

        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        users[3] = user4;

        for (User each : UserUtils.uniqueUsers(users)) {
            System.out.println(each);
        }
        System.out.println();
        for (User each : UserUtils.usersWithConditionalBalance(users, 20000)) {
            System.out.println(each);
        }
        System.out.println();
        for (User each : UserUtils.paySalaryToUsers(users)) {
            System.out.println(each);
        }
        System.out.println();
        for (long each : UserUtils.getUsersId(users)) {
            System.out.println(each);
        }
        System.out.println();
        for (User eachusers : UserUtils.deleteEmptyUsers(users)) {
            System.out.println(eachusers);

        }
    }
}

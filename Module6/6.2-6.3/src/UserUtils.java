/**
 * Created by Людмила on 13.03.2017.
 */
public class UserUtils {

    //User[] uniqueUsers(User[] users)
    //– находит и возвращает уникальных пользователей (пользователи одинаковы, когда все их поля совпадают)
    public static User[] uniqueUsers(User[] users) {
        User[] temp1 = new User[users.length];
        User[] temp2 = users.clone();
        User[] uniqueUsers = new User[users.length];

        for (int i = 0; i < users.length; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (users[i].equals(users[j])) {
                    temp2[j] = null;
                } else {
                    temp1[j] = users[j];
                }
            }
        }
        for (int k = 0; k < users.length; k++) {
            for (int l = k; l < temp2.length; l++) {
                if (temp2[k] != null && temp1[k] != null) {
                    if (users[k].equals(temp2[l])) {
                    } else {
                        uniqueUsers[l] = temp2[l];
                    }
                }
            }
        }

        return uniqueUsers;
    }
   // User[] usersWithConditionalBalance(User[] users, int balance)
    //– находит и возвращает пользователей, чей баланс равен заданному
   public static User[] usersWithConditionalBalance(User[] users, int balance) {
       int notEmpty = 0;
       for (int j = 0; j < users.length; j++) {
           if (users[j].getId() != 0 && users[j].getFirstName() != null && users[j].getLastName() != null
                   && users[j].getSalary() != 0 && users[j].getBalance() != 0 && users[j].getBalance() == balance) {
               notEmpty++;
           }
       }

       User[] usersWithConditionalBalance = new User[notEmpty];

       int count = 0;
       for (int m = 0; m < users.length; m++) {
           if (users[m].getId() != 0 && users[m].getFirstName() != null && users[m].getLastName() != null
                   && users[m].getSalary() != 0 && users[m].getBalance() != 0 && users[m].getBalance() == balance) {
               usersWithConditionalBalance[count] = users[m];
               count++;
           }
       }

       return usersWithConditionalBalance;
   }

   /*
    User[]  paySalaryToUsers(User[] users)
    – начисляет зарплату в баланс каждому пользователю
*/
   public static final User[] paySalaryToUsers(User[] users) {
       for (User user : users) {
           if (user != null)
               user.giveSalary();
       }
       return users;
   }


    //long[] getUsersId(User[] users)
    //– возвращает массив идентификаторов пользователей
    public static final long[] getUsersId(User[] users) {
        long[] usersId = new long[users.length];
        for (int l = 0; l < users.length; l++) {
            usersId[l] = users[l].getId();
        }
        return usersId;
    }


    //User[] deleteEmptyUsers(User[] users)
    //– находит и удаляет пустые элементы из массива (в результате возвращается новый массив с меньшим размером)
    public static User[] deleteEmptyUsers(User[] users) {
        int notEmpty = 0;
        for (int m = 0; m < users.length; m++) {
            if (users[m].getId() != 0 && users[m].getFirstName() != null && users[m].getLastName() != null
                    && users[m].getSalary() != 0 && users[m].getBalance() != 0) {
                notEmpty++;
            }
        }

        User[] notEmptyUsers = new User[notEmpty];

        int count = 0;
        for (int m = 0; m < users.length; m++) {
            if (users[m].getId() != 0 && users[m].getFirstName() != null && users[m].getLastName() != null
                    && users[m].getSalary() != 0 && users[m].getBalance() != 0) {
                notEmptyUsers[count] = users[m];
                count++;
            }
        }

        return notEmptyUsers;
    }
}


    //Удостоверьтесь, что методы paySalaryToUsers и getUsersId не могут быть перезаписаны в других классах.


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        User aor = new User(111, "Irina", "Ior", "Iiev", 4001);
        User bor = new User(112, "Brina", "Bor", "Biev", 4002);
        User cor = new User(113, "Crina", "Cor", "Ciev", 4003);
        User dor = new User(114, "Drina", "Dor", "Diev", 4004);
        User kor = new User(115, "Krina", "Kor", "Kiev", 4005);
        User lor = new User(116, "Lrina", "Lor", "Liev", 4006);
        User mor = new User(117, "Mrina", "Mor", "Miev", 4007);
        User nor = new User(118, "Nrina", "Nor", "Wiev", 4008);
        User oor = new User(119, "Orina", "Oor", "Oiev", 4009);
        User por = new User(110, "Prina", "Por", "Piev", 4000);

        ArrayList<Order> orders = new ArrayList<>();

        orders.add(new Order(1111, 1111, Currency.UAH, "Iook", "Ihop", aor));
        orders.add(new Order(1112, 1112, Currency.USD, "Book", "Bhop", bor));
        orders.add(new Order(1113, 1113, Currency.UAH, "Cook", "Chop", cor));
        orders.add(new Order(1114, 1114, Currency.USD, "Dook", "Dhop", dor));
        orders.add(new Order(1115, 1115, Currency.UAH, "Kook", "Khop", kor));
        orders.add(new Order(1116, 1116, Currency.USD, "Look", "Lhop", lor));
        orders.add(new Order(1117, 1117, Currency.UAH, "Gook", "Mhop", mor));
        orders.add(new Order(1118, 1118, Currency.USD, "Wook", "Nhop", nor));
        orders.add(new Order(1119, 1119, Currency.UAH, "Wook", "Ohop", oor));
        orders.add(new Order(1110, 1110, Currency.USD, "Wook", "Phop", por));

        Methods methods = new Methods();

       /* methods.priceDown(orders);
        System.out.println("отсортируйте список за ценой заказа по убыванию");
        for (Order o : orders) {
            System.out.println(o);
        }*/

       ;
        System.out.println("отсортируйте список за ценой заказа по возрастанию и за городом пользователя");
      //  for (Order p : orders) {
            System.out.println(Order o:  methods.priceUpCity(orders));
        }

        methods.nameIdCity(orders);
        System.out.println("отсортируйте список за наименованием товара, идентификатором заказа, и городом пользователя");
        for (Order order : orders) {
            System.out.println(order);
        }

        methods.remove(orders);
        System.out.println("удалите дублированные данные со списка");
        for (Order order : orders) {
            System.out.println(order);
        }

    }
}

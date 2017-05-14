import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        User aor = new User(111, "Irina", "Petrov", "Iiev", 4001);
        User bor = new User(112, "Brina", "Bor", "Biev", 4002);
        User cor = new User(113, "Crina", "Cor", "Ciev", 4003);
        User dor = new User(114, "Drina", "Dor", "Diev", 4004);
        User kor = new User(115, "Krina", "Kor", "Kiev", 4005);
        User lor = new User(116, "Lrina", "Lor", "Liev", 4006);
        User mor = new User(117, "Mrina", "Mor", "Miev", 4007);
        User nor = new User(118, "Nrina", "Nor", "Wiev", 4008);
        User oor = new User(110, "Prina", "Por", "Piev", 4000);
        User por = new User(110, "Prina", "Por", "Piev", 4000);

        ArrayList<Order> orders = new ArrayList<>();

        orders.add(new Order(1111, 1555, Currency.UAH, "Iook", "Ihop", aor));
        orders.add(new Order(1112, 1112, Currency.USD, "Book", "Bhop", bor));
        orders.add(new Order(1113, 1113, Currency.UAH, "Cook", "Chop", cor));
        orders.add(new Order(1114, 1114, Currency.USD, "Dook", "Dhop", dor));
        orders.add(new Order(1115, 1115, Currency.UAH, "Kook", "Khop", kor));
        orders.add(new Order(1116, 1116, Currency.USD, "Look", "Lhop", lor));
        orders.add(new Order(1117, 1117, Currency.UAH, "Mook", "Mhop", mor));
        orders.add(new Order(1118, 1118, Currency.USD, "Nook", "Nhop", nor));
        orders.add(new Order(1110, 1110, Currency.USD, "Iook", "Ihop", oor));
        orders.add(new Order(1110, 1110, Currency.USD, "Iook", "Ihop", por));

        Methods methods = new Methods();

        out.println("отсортируйте список за ценой заказа по убыванию");
        methods.priceDown(orders);
        orders.forEach(order -> out.println(order));

        out.println("отсортируйте список за ценой заказа по возрастанию и за городом пользователя");
        methods.priceUpCity(orders);
        orders.forEach(order -> out.println(order));

        out.println("оотсортируйте список за наименованием товара, идентификатором заказа, и городом пользователя");
        methods.nameIdCity(orders);
        orders.forEach(order -> out.println(order));

        out.println("удалите дублированные данные со списка");
        List<Order> newOrders = methods.remove(orders);
        newOrders.forEach(order -> out.println(order));

        out.println("разделите список на 2 списка - заказы в долларах и в гривнах");
        out.println((methods.separateCurrency(orders).toString().replaceAll("}}, ", "}}]\n")).replaceAll("}}], ", "\n\n"));

        out.println("разделите список на столько списков, сколько уникальных городов в User");
        out.println(methods.separateCity(orders).toString().replaceAll("}}, ", "}}]\n").replaceAll("}}], ", "\n\n"));

        out.println("проверьте, содержит ли сет заказ, где фамилия пользователя - “Petrov”");
        out.println(methods.petrov(orders, "Petrov"));

        out.println("удалите заказы в USD");
        methods.removeUSD(orders);
        orders.forEach(order -> out.println(order));

        out.println("удалите объекты, где цена меньше 1500");
        methods.remove1500(orders);
        orders.forEach(order -> out.println(order));
    }
}

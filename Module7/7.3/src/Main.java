import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        User aor = new User(111, "Irina", "Petrov", "Iiev", 4001);
        User bor = new User(112, "Brina", "Bor", "Biev", 4002);
        User cor = new User(113, "Crina", "Cor", "Ciev", 4003);
        User dor = new User(114, "Drina", "Dor", "Diev", 4004);
        User kor = new User(115, "Krina", "Kor", "Kiev", 4005);
        User lor = new User(116, "Lrina", "Lor", "Liev", 4006);
        User mor = new User(117, "Mrina", "Mor", "Miev", 4007);
        User nor = new User(118, "Nrina", "Nor", "Niev", 4008);
        User oor = new User(119, "Orina", "Oor", "Oiev", 4009);
        User por = new User(110, "Prina", "Por", "Piev", 4000);

        TreeSet<Order> setOrder = new TreeSet<Order>();

        setOrder.add(new Order(1111, 1111, Currency.UAH, "Iook", "Ihop", aor));
        setOrder.add(new Order(1112, 1112, Currency.USD, "Book", "Bhop", bor));
        setOrder.add(new Order(1113, 1113, Currency.UAH, "Cook", "Chop", cor));
        setOrder.add(new Order(1114, 1114, Currency.USD, "Dook", "Dhop", dor));
        setOrder.add(new Order(1115, 1115, Currency.UAH, "Kook", "Khop", kor));
        setOrder.add(new Order(1116, 1116, Currency.USD, "Look", "Lhop", lor));
        setOrder.add(new Order(1117, 1117, Currency.UAH, "Mook", "Mhop", mor));
        setOrder.add(new Order(1118, 1118, Currency.USD, "Nook", "Nhop", nor));
        setOrder.add(new Order(1119, 1119, Currency.UAH, "Oook", "Ohop", oor));
        setOrder.add(new Order(1110, 1110, Currency.USD, "Pook", "Phop", por));

        System.out.println("проверьте, содержит ли сет заказ, где фамилия пользователя - “Petrov” ");
        for (Order i : setOrder) {
            if (i.getUser().getLastName().equals("Petrov")) {
                System.out.println(i);
            } else
                System.out.println("Petrov отсутствует");
            break;
        }
        System.out.println();

        System.out.println("выведите заказ с наибольшей ценой, исспользуя только один сет-метод - get ");
        System.out.println(setOrder.last());
        System.out.println();

        System.out.println("удалите заказы, где валюта доллар, используя Iterator");
        TreeSet<Order> treeSetWithoutUsd = new TreeSet<>();
        Iterator<Order> dellUsdIterator = setOrder.iterator();
        Order countOrders;
        while (dellUsdIterator.hasNext()) {
            countOrders = dellUsdIterator.next();
            if (countOrders.getCurrency() != Currency.USD) {
                treeSetWithoutUsd.add(countOrders);
            }
        }
        for (Order i : treeSetWithoutUsd) {
            System.out.println(i);
        }
    }
}

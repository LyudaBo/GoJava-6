import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Людмила on 07.05.2017.
 */
public class Methods {
    public void priceDown(List<Order> arrayList) {
        Collections.sort(arrayList, (o1, o2) -> o2.getPrice() - o1.getPrice());
    }

    public void priceUpCity(ArrayList<Order> arrayList) {
        arrayList.sort(Comparator.comparing(Order::getPrice).
                thenComparing(Comparator.comparing(order -> order.getUser().getCity())));
    }
     /* arrayList.stream().sorted(
                (o1, o2) -> o1.getPrice() != o2.getPrice() ? o1.getPrice() - (o2.getPrice()) :
                        o1.getUser().getCity().compareTo(o2.getUser().getCity()));
    }*/

    public void nameIdCity(ArrayList<Order> arrayList) {
        arrayList.sort(Comparator.comparing(Order::getItemName).
                thenComparing(Order::getShopIdentificator).
                thenComparing(Comparator.comparing(order -> order.getUser().getCity())));
    }
        /* arrayList.stream().sorted(
                (o1, o2) -> !o1.getItemName().equals(o2.getItemName()) ? o1.getItemName().compareTo(o2.getItemName()) :
                        (o1.getId() != o2.getId()) ? (int) (o1.getId() - o2.getId()) :
                                o1.getUser().getCity().compareTo(o2.getUser().getCity()));
    }*/

    public List<Order> remove(ArrayList<Order> arrayList) {
        List<Order> newOrders = new ArrayList<>();
        newOrders = arrayList.stream().distinct().collect(Collectors.toList());
        return newOrders;
    }

    public void remove1500(ArrayList<Order> arrayList) {
        arrayList.removeIf((Order o) -> o.getPrice() <= 1500);
    }

    public ArrayList<ArrayList<Order>> separateCurrency(ArrayList<Order> arrayList) {
        ArrayList<ArrayList<Order>> result = new ArrayList<ArrayList<Order>>();
        List<Order> list1 = arrayList.stream().filter(o -> o.getCurrency() == Currency.USD).collect(Collectors.toList());
        List<Order> list2 = arrayList.stream().filter(o -> o.getCurrency() == Currency.UAH).collect(Collectors.toList());
        result.add((ArrayList<Order>) list1);
        result.add((ArrayList<Order>) list2);
        return result;
    }

    public static Map<String, List<Order>> separateCity(ArrayList<Order> arrayList) {
        return arrayList.stream().collect(Collectors.groupingBy(o -> o.getUser().getCity()));
    }

    public boolean petrov(ArrayList<Order> arrayList, String lastName) {
        return arrayList.stream().anyMatch(o -> o.getUser().getLastName().equals(lastName));
        //arrayList.stream().filter((o -> o.getUser().getLastName().equals(lastName))).collect(Collectors.toList());
    }

    public void removeUSD(ArrayList<Order> arrayList) {
        arrayList.removeIf((Order o) -> o.getCurrency() == Currency.USD);
    }
}

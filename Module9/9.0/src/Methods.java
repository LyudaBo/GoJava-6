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
        arrayList.stream().sorted(
                (o1, o2) -> o1.getPrice() != o2.getPrice() ? o1.getPrice() - (o2.getPrice()) :
                        o1.getUser().getCity().compareTo(o2.getUser().getCity()));
    }

    public void nameIdCity(ArrayList<Order> arrayList) {
        arrayList.stream().sorted(
                (o1, o2) -> !o1.getItemName().equals(o2.getItemName()) ? o1.getItemName().compareTo(o2.getItemName()) :
                        (o1.getId() != o2.getId()) ? (int) (o1.getId() - o2.getId()) :
                                o1.getUser().getCity().compareTo(o2.getUser().getCity()));
    }

    public void remove(ArrayList<Order> arrayList) {
        arrayList.stream().distinct().collect(Collectors.toList());
    }

    public void remove1500(ArrayList<Order> arrayList) {
        arrayList.removeIf((Order o) -> o.getPrice() <= 1500);
    }

    public void separateCurrency(ArrayList<Order> arrayList) {
        List<Order> list1 = arrayList.stream().filter(o -> o.getCurrency().equals(Currency.USD)).collect(Collectors.toList());
        List<Order> list2 = arrayList.stream().filter(o -> o.getCurrency().equals(Currency.UAH)).collect(Collectors.toList());
    }

    public void separateCity(ArrayList<Order> arrayList) {
        arrayList.stream().collect(Collectors.groupingBy(o -> o.getUser().getCity()));
    }

    public void petrov(ArrayList<Order> arrayList, String lastName) {
        arrayList.stream().filter((o -> o.getUser().getLastName().equals(lastName))).collect(Collectors.toList());
    }

    public void removeUSD(ArrayList<Order> arrayList) {
        arrayList.removeIf((Order o) -> o.getCurrency() == Currency.USD);
    }
}

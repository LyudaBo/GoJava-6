import java.util.List;
import java.util.Set;

public interface IManageSystem<T> {
    T save(T obj, double price);

    T save(T obj);

    void delete(T obj);

    void deleteById(int id);

    T get(int id);

    Double getPrice(T obj);

    Set<T> getProducts();

    List<Double> getPrices();

    // 8.6. Добавьте в интерфейс методы и проверьте их работу:
    void printProductsSortedByName(); // - выводит список «продукт-цена», отсортированных по имени продукта.

    void printProductsSortedByPrice(); //- выводит список «продукт-цена», отсортированных по цене продукта (по возрастанию).

}

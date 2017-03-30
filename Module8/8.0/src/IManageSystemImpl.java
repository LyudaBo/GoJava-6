import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Людмила on 30.03.2017.
 */
public class IManageSystemImpl<T extends Food> implements IManageSystem<T> {
    private Map<Food, Double> database;
    //Поле эмулирует базу данных, содержит в себе данные о продуктах и их цене.
    // Поле должно быть доступно только внутри данного класса.

    @Override
    public T save(T obj, double price) {
        return null;
    }

    @Override
    public T save(T obj) {
        return null;
    }

    @Override
    public void delete(T obj) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public T get(int id) {
        return null;
    }

    @Override
    public Double getPrice(T obj) {
        return null;
    }

    @Override
    public Set<T> getProducts() {
        return null;
    }

    @Override
    public List<Double> getPrices() {
        return null;
    }

    @Override
    public void printProductsSortedByName() {

    }

    @Override
    public void printProductsSortedByPrice() {

    }

}

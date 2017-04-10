import java.util.*;

/**
 * Created by Людмила on 30.03.2017.
 */
public class IManageSystemImpl<T extends Food> implements IManageSystem<Food> {
    private Map<Food, Double> database = new HashMap<Food, Double>();
    //Поле эмулирует базу данных, содержит в себе данные о продуктах и их цене.
    // Поле должно быть доступно только внутри данного класса.

    @Override
    public Food save(Food obj, double price) {
        database.put(obj, price);
        return obj;
    }

    @Override
    public Food save(Food obj) {
        database.put(obj, 0.0);
        return obj;
    }

    @Override
    public void delete(Food obj) {
        database.remove(obj);
    }

    @Override
    public void deleteById(int id) {
        Set<Food> set = database.keySet();
        set.removeIf(t -> t.getId() == id);
    }

    @Override
    public Food get(int id) {
        Set<Food> set = database.keySet();
        for (Food food : set) {
            if (food.getId() == id)
                return food;
        }
        return null;
    }

    @Override
    public Double getPrice(Food obj, Food food) {
        return (food == null) ? null : database.get(food);
    }

    @Override
    public Set<Food> getProducts() {
        return database.keySet();
    }

    @Override
    public List<Double> getPrices() {
        return new ArrayList<>(database.values());
    }

    @Override
    public void printProductsSortedByName() {
    }

    @Override
    public void printProductsSortedByPrice() {
    }

}

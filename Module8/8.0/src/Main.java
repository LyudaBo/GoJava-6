
import java.util.List;
import java.util.Set;

/**
 * Created by Людмила on 30.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        //Проверьте работу Manage System в классе Main (на примере 5+ продуктов).

        Food salo = new Food("Salo", Country.Ukraine, 30);
        Food icecream = new Food("Medved", Country.Russia, 100);
        Food tea = new Food("Greenfield", Country.England, 200);
        Food cheese = new Food("Brie", Country.France, 150);
        Food mango = new Food("Mango", Country.India, 10);
        Food potato = new Food("Potato", Country.Ukraine, 30);

        System.out.println(salo);
        System.out.println(icecream);
        System.out.println(tea);
        System.out.println(cheese);
        System.out.println(mango);
        System.out.println(potato);

        IManageSystemImpl testshop = new IManageSystemImpl();
        testshop.save(salo, 50);
        testshop.save(icecream, 10);
        testshop.save(tea, 25);
        testshop.save(cheese, 100);
        testshop.save(mango, 30);
        testshop.save(potato, 5);

        System.out.println("search by ID: " + testshop.get(5));
        System.out.println("price for " + tea.getName() + " is: " + testshop.getPrice(tea, tea));

        Set productSet = testshop.getProducts();
        System.out.println("all products in database: " + productSet);

        List productPrices = testshop.getPrices();
        System.out.println("prices in the databases: " + productPrices);

        testshop.delete(mango);
        testshop.deleteById(5);
        System.out.println("delete some products" + productSet);
    }
}

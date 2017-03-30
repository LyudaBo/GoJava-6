/**
 * Created by Людмила on 30.03.2017.
 */
public class Food {
    private long id; //(уникальный идентификатор товара)
    private String name; //(наименование товара)
    private Country country; // (страна производитель)
    private int expiration; // (срок годности в днях)

    /* Реализуйте доступ к полям. Идентификатор id должен быть недоступен для изменения и
    генерироваться с помощью IdGenerator при создании товара.
    Товары считаются одинаковыми, если их id одинаковы. Переопределите методы hashCode и equals соответственно.*/

    public Food(long id, String name, Country country, int expiration) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.expiration = expiration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        return id == food.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}

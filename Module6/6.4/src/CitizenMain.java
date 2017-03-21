

/**
 * Created by Людмила on 13.03.2017.
 */
public class CitizenMain {
    public static void main(String[] args) {
        Citizen[] citizens = new Citizen[]{
                CitizenFactory.englishman(),
                CitizenFactory.chinese(),
                CitizenFactory.russian(),
                CitizenFactory.italian()};

        for (Citizen people : citizens) {
            people.sayHello();
        }
    }
}

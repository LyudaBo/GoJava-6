/**
 * Created by Людмила on 17.04.2017.
 */
public class Sum extends Exception {
    public static void threeExceptionsMethod(int number) throws Class1, Class2, Class3 {
        if (number == 1) {
            throw new Class1("Class1");
        }
        if (number == 2) {
            throw new Class2("Class2");
        }
        if (number == 3) {
            throw new Class3("Class3");
        }
    }
}

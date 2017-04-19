/**
 * Created by Людмила on 19.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Sum.threeExceptionsMethod(1);
            Sum.threeExceptionsMethod(2);
            Sum.threeExceptionsMethod(3);
        } catch (Exception ex) {
            System.out.println("All");
        }
    }
}


/**
 * Created by Людмила on 16.04.2017.
 */
public class Main {
    public static void main(String[] args) throws Exception1 {
        try {
            ClassOfExceptions.f();
        } catch (Exception2 ex2) {
            System.out.println(ex2);
            System.out.println("Twice");
        }
    }
}

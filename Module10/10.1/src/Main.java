/**
 * Created by Людмила on 16.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("String argument");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Its working");
        }
    }
}

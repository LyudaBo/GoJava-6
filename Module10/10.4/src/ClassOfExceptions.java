/**
 * Created by Людмила on 16.04.2017.
 */
public class ClassOfExceptions {

    public static void f() throws Exception2, Exception1 {
        try {
            g();
        } catch (Exception1 ex1) {
            throw new Exception2("Exception2");
        }
    }

    public static void g() throws Exception1 {
        throw new Exception1("Exception1");
    }
}

/**
 * Created by Людмила on 16.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {
                throw new ClassOfExeptions("New");
            }
            System.err.print(" 1");
        } catch (ClassOfExeptions newExeption) {
            System.err.print(" 2 " + newExeption);
        }
        System.err.println(" 3");

        // Для 10.3
        try {
            ClassOfExeptions reference = null;
            reference.getWord();
        } catch (Exception ex1) {
            System.out.println(ex1);
        }
    }
}

/**
 * Created by Людмила on 05.03.2017.
 */
public class Result {
    public static void main(String[] args) {
        int[] array = {3, -9, 6, 3, 6, 8, 45, 56, 4, 5};
        double[] arr = {7.9, -5.6, 9.8, -7.4, 567.76, 7.43, -0.001, 75.09, 32.8, -21.56};
        ForInt MyInt = new ForInt();
        System.out.println("sum " + MyInt.sum(array));
        System.out.println("max " + MyInt.max(array));
        System.out.println("min " + MyInt.min(array));
        System.out.println("maxPositive " + MyInt.maxPositive(array));
        System.out.println("multiplication " + MyInt.Multiplication(array));
        System.out.println("firstModulus " + MyInt.firstModulus(array));
        System.out.println("lastModulus " + MyInt.lastModulus(array));
        System.out.println("secondLargest " + MyInt.secondLargest(array));

        ForDouble MyDouble = new ForDouble();
        System.out.println("sum " + MyDouble.sum(arr));
        System.out.println("max " + MyDouble.max(arr));
        System.out.println("min " + MyDouble.min(arr));
        System.out.println("maxPositive " + MyDouble.maxPositive(arr));
        System.out.println("multiplication " + MyDouble.Multiplication(arr));
        System.out.println("firstModulus " + MyDouble.firstModulus(arr));
        System.out.println("lastModulus " + MyDouble.lastModulus(arr));
        System.out.println("secondLargest " + MyDouble.secondLargest(arr));

    }
}

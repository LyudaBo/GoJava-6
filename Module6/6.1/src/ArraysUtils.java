/**
 * Created by Людмила on 12.03.2017.
 */
public final class ArraysUtils {

    public static int sum(int[] array) {
        int sum = 0;
        for (int number : array)
            sum += number;
        return sum;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int number : array)
            if (number > max) {
                max = number;
            }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int number : array)
            if (number < min) {
                min = number;
            }
        return min;
    }

    public static String maxPositive(int[] array) {
        int maxPositive = 0;
        for (int number : array)
            if (number > 0 && maxPositive < number)
                maxPositive = number;
        if (maxPositive <= 0) {
            return "нет положительных";
        } else
            return String.valueOf(maxPositive);
    }

    public static int multiplication(int[] array) {
        int product = 1;
        for (int number : array) product *= number;
        return product;
    }

    public static int modulus(int[] array) {
        return array[0] % array[array.length - 1];
    }

    public static int secondLargest(int[] array) {
        int max = max(array);
        int second = array[0];
        for (int i = 0; i < array.length; i++) {
            if (second < array[i] && max > array[i]) {
                second = array[i];
            }
        }
        return second;
    }

    public static int[] reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    public static int[] findEvenElements(int[] array) {
        int noEmpty = 0;
        for (int m = 0; m < array.length; m++) {
            if (array[m] != 0) {
                noEmpty++;
            }
        }

        int[] evenArray = new int[noEmpty];

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                evenArray[count] = array[i];
                count++;
            }
        }
        return evenArray;
    }
}

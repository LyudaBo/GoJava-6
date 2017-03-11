/**
 * Created by Людмила on 05.03.2017.
 */
public class ForInt {

    public int sum(int[] array) {
        int sum = 0;
        for ( int number : array)
            sum += number;
        return sum;
    }

    public int max(int[] array) {

        int max = 0;
        for (int i = 0; i != array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int min(int[] array) {

        int min = 0;
        for (int i = 0; i != array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int maxPositive(int[] array) {

        int maxPositive = 0;
        for (int number : array)
            if (number > 0 && maxPositive < number)
                maxPositive = number;

        return maxPositive;
    }

    public int Multiplication(int[] array) {
        int product = 1;
        for (int number : array) product *= number;
        return product;
    }

    public int firstModulus(int[] array) {
        return array[0] % array[array.length - 1];
    }

    public int lastModulus(int[] array) {
        return array[array.length - 1] % array[0];
    }

    public int largest(int[] array) {
        int largest = array[0];
        int secondLargest = array[0];
        for (int number : array)
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest)
                secondLargest = number;
        return largest;
    }
}

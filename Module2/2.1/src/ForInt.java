/**
 * Created by Людмила on 05.03.2017.
 */
public class ForInt {

    public int sum(int[] array) {
        int sum = 0;
        for (int number : array)
            sum += number;
        return sum;
    }

    public int max(int[] array) {
        int max = array[0];
        int largest = array[0];
        for (int number : array)
            if (number > max) {
                largest = max;
                max = number;
            } else if (number > largest)
                largest = number;
        return max;
    }

    public int min(int[] array) {
        int min = array[0];
        int largest = array[0];
        for (int number : array)
            if (number < min) {
                largest = min;
                min = number;
            } else if (number < largest)
                largest = number;
        return min;
    }

    public String maxPositive(int[] array) {

        int maxPositive = 0;
        for (int number : array)
            if (number > 0 && maxPositive < number)
                maxPositive = number;
        if (maxPositive <= 0) {
            return "нет положительных";
        } else
            return String.valueOf(maxPositive);
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

    public int secondLargest(int[] array) {
        int secondLargest = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < max(array))
                if (array[j] > secondLargest) {
                    secondLargest = array[j];
                }
        }
        return secondLargest;
    }
}

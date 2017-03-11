import static java.lang.Math.abs;

/**
 * Created by Людмила on 05.03.2017.
 */
public class ForDouble {
    public double sum(double[] array) {
        double sum = 0;
        for (double number : array)
            sum += number;
        return sum;
    }

    public double max(double[] array) {

        double max = 0;
        for (int i = 0; i != array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public double min(double[] array) {

        double min = 0;
        for (int i = 0; i != array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public double maxPositive(double[] array) {

        double maxPositive = 0;
        for (double number : array)
            if (number > 0 && maxPositive < number)
                maxPositive = number;
        return maxPositive;
    }

    public double Multiplication(double[] array) {
        double product = 1;
        for (double number : array) product *= number;
        return product;
    }

    public double firstModulus(double[] array) {
        return array[0] % array[array.length - 1];
    }

    public double lastModulus(double[] array) {
        return array[array.length - 1] % array[0];
    }

    public double largest(double[] array) {
        double largest = array[0];
        double secondLargest = array[0];
        for (double number : array)
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest)
                secondLargest = number;
        return largest;
    }
}

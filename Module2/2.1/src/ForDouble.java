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
        double max = array[0];
        double largest = array[0];
        for (double number : array)
            if (number > max) {
                largest = max;
                max = number;
            } else if (number > largest)
                largest = number;
        return max;
    }

    public double min(double[] array) {
        double min = array[0];
        double largest = array[0];
        for (double number : array)
            if (number < min) {
                largest = min;
                min = number;
            } else if (number < largest)
                largest = number;
        return min;
    }

    public String maxPositive(double[] array) {

        double maxPositive = 0;
        for (double number : array)
            if (number > 0 && maxPositive < number)
                maxPositive = number;
        if (maxPositive <= 0) {
            return "нет положительных";
        } else
            return String.valueOf(maxPositive);
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

    public double secondLargest(double[] array) {
        double secondLargest = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < max(array))
                if (array[j] > secondLargest) {
                    secondLargest = array[j];
                }
        }
        return secondLargest;
    }
}

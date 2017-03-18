import static java.lang.Math.abs;

public class ForDouble {
    public double sum(double[] array) {
        double sum = 0;
        for (double number : array)
            sum += number;
        return sum;
    }

    public double max(double[] array) {
        double max = array[0];
        for (double number : array)
            if (number > max) {
                max = number;
            }
        return max;
    }

    public double min(double[] array) {
        double min = array[0];
        for (double number : array)
            if (number < min) {
                min = number;
            }
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
        double max = max(array);
        double second = array[0];
        for (int i = 0; i < array.length; i++) {
            if (second < array[i] && max > array[i]) {
                second = array[i];
            }
        }
        return second;
    }
}

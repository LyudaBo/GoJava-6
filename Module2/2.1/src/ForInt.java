
public class ForInt {

    public int sum(int[] array) {
        int sum = 0;
        for (int number : array)
            sum += number;
        return sum;
    }

    public int max(int[] array) {
        int max = array[0];
        for (int number : array)
            if (number > max) {
                max = number;
            }
        return max;
    }

    public int min(int[] array) {
        int min = array[0];
        for (int number : array)
            if (number < min) {
                min = number;
            }
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

    public int multiplication(int[] array) {
        int product = 1;
        for (int number : array) product *= number;
        return product;
    }

    public int modulus(int[] array) {
        return array[0] % array[array.length - 1];
    }

    public int secondLargest(int[] array) {
        int max = max(array);
        int second = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < max && array[i] > second) second = array[i];
            if (second == max) second = array[1];
        }
        return second;
    }
}


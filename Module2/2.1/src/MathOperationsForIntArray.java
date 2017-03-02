
public class MathOperationsForIntArray {

    public int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];

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

    }


}
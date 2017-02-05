
public class MathOperationsForDoubleArray {
    public static void main(String[] args) {
        double[] array = {78.9, -5.6, 9.8, -7.4, 567.76, 7.43, -0.001, 75.09, 32.8, -21.56};

        double sum = 0;
        for ( double number : array)
            sum += number;
        System.out.println(sum); // sum(double array[])

        double max = array[0];
        double min = array[0];
        for (int i = 0; i != array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min + " " + max); //min(double array[]), max(double array[])

        double maxPositive = 0;
        for (double number : array)
            if (number > 0 && maxPositive < number)
                maxPositive = number;
        System.out.println(maxPositive); //maxPositive(double array[])

        double product = 1;
        for (double number : array)
            product *= number;
        System.out.println("Multiplication: " + product); //multiplication  (double array[])

        double first = array[0];
        double last = array[array.length - 1];
        System.out.println("First: " + Math.abs(first));
        System.out.println("Last: " + Math.abs(last)); //modulus of first and last element double array[]

        double largest = array[0];
        double secondLargest = array[0];
        for (double number : array)
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest)
                secondLargest = number;
        System.out.println("Second largest: " + secondLargest);//second largest element (double array[])
    }

}

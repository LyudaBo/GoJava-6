
public class MathOperationsForIntArray {
    public static void main(String[] args) {
        int [] array = {1, 3, 6, 5, 8, 7, 2, 4, -10, 9};

        int sum = 0;
        for(int number : array)
            sum += number;
        System.out.println(sum); // sum(int array[])

        int max = array[0];
        int min = array[0];
        for(int i = 0; i != array.length; i ++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min + " " + max); //min(int array[]), max(int array[])

        int maxPositive = 0;
        for(int number : array)
            if(number>0 && maxPositive<number)
                maxPositive = number;
        System.out.println(maxPositive); //maxPositive(int array[])

        int product = 1;
        for(int number : array)
            product *= number;
        System.out.println("Multiplication: " + product); //multiplication  (int array[])

        int first = array[0];
        int last = array[array.length - 1];
        System.out.println("First: " + Math.abs(first));
        System.out.println("Last: " + Math.abs(last)); //modulus of first and last element int array[]

        int largest = array[0];
        int secondLargest = array[0];
        for (int number : array)
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest)
                secondLargest = number;
        System.out.println("Second largest: " + secondLargest);//second largest element (int array[])


    }

}

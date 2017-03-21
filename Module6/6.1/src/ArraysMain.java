

public class ArraysMain {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 11) - 5);
            System.out.println(array[i]);
        }

        ArraysUtils MyInt = new ArraysUtils();
        System.out.println("sum " + MyInt.sum(array));
        System.out.println("max " + MyInt.max(array));
        System.out.println("min " + MyInt.min(array));
        System.out.println("maxPositive " + MyInt.maxPositive(array));
        System.out.println("multiplication " + MyInt.multiplication(array));
        System.out.println("Modulus " + MyInt.modulus(array));
        System.out.println("secondLargest " + MyInt.secondLargest(array));
        System.out.println("reverse " + MyInt.reverse(array));
        System.out.println("findEvenElements " + MyInt.findEvenElements(array));
    }
}


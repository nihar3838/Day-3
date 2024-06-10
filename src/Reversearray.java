public class Reversearray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70};

        System.out.println("Array elements in reverse order:");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}

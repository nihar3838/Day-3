public class LargestElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        System.out.println("The largest element in the array is: " + largest);
    }
}

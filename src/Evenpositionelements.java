public class Evenpositionelements {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60, 70};

        System.out.println("Elements at even positions are:");

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Position " + i + ": " + array[i]);
            }
        }
    }
}


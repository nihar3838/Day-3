public class Oddpositionelements  {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60, 70};

        System.out.println("Elements at odd positions are:");

        for (int i = 1; i < array.length; i+=2) {
            // if (i %  2 == 0)
                System.out.println("Position " + i + ": " + array[i]);

        }
    }
}


public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        boolean[] visited = new boolean[array.length];

        System.out.println("Element | Frequency");
        System.out.println("-------------------");

        for (int i = 0; i < array.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println("   " + array[i] + "    |    " + count);
        }
    }
}

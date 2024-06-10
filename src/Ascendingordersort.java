public class Ascendingordersort {
    public static void main (String [] args) {
        int[] array = {20, 10, 40, 5, 15, 50, 40};

        System.out.println("Original array is :");
        for (int i : array) {
            System.out.print(i +" ");
        }
        System.out.println();

        bubblesort(array);

        System.out.println("Sorted array in ascending order is :");
        for(int i:array){
            System.out.println(i+ " ");

        }
    }
    public static void bubblesort(int[] array){
        int n = array.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                }
            }
        }
    }
}

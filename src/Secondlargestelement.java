public class Secondlargestelement {
    public static void main(String[] args) {
        int [] array = {10,20, 40, 10, 40, 80};
        if (array.length < 2) {
            System.out.println("There are less elements to find second largest element");
            return;
        }
        int secondLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number in the array:");
        } else {
            System.out.println("The Second largest number in the array is :" + secondLargest);
        }
    }

}


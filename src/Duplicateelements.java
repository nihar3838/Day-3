public class Duplicateelements {
    public static void main (String [] args){
        int [] array = {10,20,30,20,30,40,50,40};
        System.out.println("Duplicate elements in the array are :");
        for(int i=0;i<array.length;i++) {
            for(int j=i+1; j<array.length;j++) {
                if(array[i] == array[j]) {
                    System.out.println(array[i]);
                        break;
                }
            }
        }

    }
}

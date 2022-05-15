/*
 * This program creates 3 arrays with random numbers and sorts them using different sorting routines
 * */
public class Lab23A {
    public static void main(String [] args){
        // Declare 3 arrays
        Integer [] array1 = new Integer[100];
        Integer [] array2 = new Integer[100];
        Integer [] array3 = new Integer[100];

        // Call fillArray method to fill array
        fillArray(array1);
        fillArray(array2);
        fillArray(array3);

        // Call the selection sort method
        long start = System.nanoTime();
        selSort(array1);
        long end = System.nanoTime();
        System.out.println("\nIt takes " + (end - start) + " nanoseconds for a Selection Sort routine to sort this array.\n");

        // Call the bubble sort method
        start = System.nanoTime();
        bubSort(array2);
        end = System.nanoTime();
        System.out.println("\nIt takes " + (end - start) + " nanoseconds for a Bubble Sort routine to sort this array.\n");

        // Call the Merge Sort method
        System.out.println("This array is sorted using Merge Sort routine:" );
        start = System.nanoTime();
        mergeSort(array3);
        end = System.nanoTime();

        for (int i = 0; i < 100; i++)
            System.out.print(array3[i] + " ");
        System.out.println("\n\nIt takes " + (end - start) + " nanoseconds for a Merge Sort routine to sort this array.\n");

    }

    public static void fillArray(Integer [] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * 101 + 0);
    }
    public static void selSort(Integer [] arr){
        for(int i = 0; i < arr.length ; i++){
            int currentMin = arr[i];
            int minIndex = i;
            for (int j = (i + 1); j < arr.length; j++){
                if (arr[j] < currentMin) {
                    currentMin = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("This array is sorted using Selection Sort routine: ");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
    public static void bubSort(Integer [] arr){
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < (arr.length - 1); j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("This array is sorted using Bubble Sort routine: ");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
    public static void mergeSort(Integer[] arr) {
        if (arr.length > 1) {
            // Merge sort the left half
            Integer[] left = new Integer[arr.length / 2];
            System.arraycopy(arr, 0, left, 0, arr.length / 2);
            mergeSort(left);

            // Merge sort the right half
            int rightLength = arr.length - arr.length / 2;
            Integer[] right = new Integer[rightLength];
            System.arraycopy(arr, arr.length / 2,
                    right, 0, rightLength);
            mergeSort(right);

            // Merge both halves into list
            merge(left, right, arr);
        }
    }

    // Merge the two sorted halves
    public static void merge(Integer[] left, Integer[] right, Integer[] temp) {
        // Declare the indexes of the 2 arrays and the temp array to merge
        int leftInd = 0;
        int rightInd = 0;
        int tempInd = 0;

        while (leftInd < left.length && rightInd < right.length) {
            if (left[leftInd] < right[rightInd])
                temp[tempInd++] = left[leftInd++];
            else
                temp[tempInd++] = right[rightInd++];
        }

        while (leftInd < left.length)
            temp[tempInd++] = left[leftInd++];

        while (rightInd < right.length)
            temp[tempInd++] = right[rightInd++];
    }

}

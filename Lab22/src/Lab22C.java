/*
 * Lab Assignment 22C Algorithm Analysis
 * Weltron Bitange
 * This program sorts a 2D array and displays it in order
 * */
public class Lab22C {
    public static void main (String [] args){
        //declare a 2D array
        int[][] arrayMain = new int [4][4];
        //fill the array with random values between 0 and 50
        for(int i = 0; i < arrayMain.length; i++){
            for (int j = 0; j < arrayMain[i].length; j++)
                arrayMain[i][j] = (int) (Math.random() * 50);
        }

        //print array
        System.out.println("This is the array before sorting: ");
        for (int[] ints : arrayMain) {
            for (int anInt : ints) System.out.print(anInt + " ");
            System.out.println();
        }
        //call sort method
        sortArray(arrayMain);
        //print array
        System.out.println("\nThis is the array after sorting: ");
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++)
                System.out.print(arrayMain[i][j]+" ");
            System.out.println();
        }
        System.out.println("\nThe time complexity is O(n^2).");
    }
    public static void sortArray(int [][] array){
        int [] newArray = new int[16];
        int x = 0;
        //copy array to 1D
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                newArray[x++] = ints[j];
            }
        }
        //sort array
        int smallest, index, temp;
        int length = newArray.length;
        for (int i = 0; i <= length-1; i++){
            smallest = newArray[i];
            index = i;
            for (int k = i + 1; k < length; k++){
                if(newArray[k] < smallest){
                    smallest = newArray[k];
                    index = k;
                }
            }
            temp = newArray[i];
            newArray[i] = newArray[index];
            newArray[index] = temp;
        }
        //copy array back to 2D
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++)
                array[j][i] = newArray[(j * 4) + i];
        }
    }
}

//import some neccessary files
import java.io.*;
//import java.io.FileNotFoundException;
import java.util.*;

//defined class
public class Test{

    //   main method or driver method
    public static void main(String[] args) throws IOException {

//       // pass the path to the file as a parameter and create object of Scanner class
        Scanner s = new Scanner(new File("reviews.txt"));

//   array to Store rating
        int arr[][] = new int[5][4];

//   array to store average rating
        double avg_rev[] = new double[4];
    try{
//   read file
            while( s.hasNext() )
            {
//       read variables and Store in array

                char c= s.next().charAt(0);

                int rat = s.nextInt();

                int rev = s.nextInt();
                String blank = s.nextLine();

//       if review is given to movie A

                if(c == 'a' || c == 'A') {

                    if(rev == 1) {
                        arr[0][0] = rat;
                        avg_rev[0]+= rat;
                    }

                    else if(rev == 2) {

                        arr[0][1] = rat;
                        avg_rev[1]+= rat;
                    }

                    else if(rev == 3) {

                        arr[0][2] = rat;
                        avg_rev[2]+= rat;
                    }

                    else if(rev == 4) {

                        arr[0][3] = rat;
                        avg_rev[3]+= rat;
                    }

                }

//       if review is given to movie B

                else if(c == 'b' || c == 'B') {

                    if(rev == 1) {

                        arr[1][0] = rat;
                        avg_rev[0]+= rat;
                    }

                    else if(rev == 2) {

                        arr[1][1] = rat;
                        avg_rev[1]+= rat;
                    }

                    else if(rev == 3) {

                        arr[1][2] = rat;
                        avg_rev[2]+= rat;
                    }

                    else if(rev == 4) {

                        arr[1][3] = rat;
                        avg_rev[3]+= rat;
                    }

                }

//       if review is given to movie C

                else if(c == 'c' || c == 'C') {

                    if(rev == 1) {

                        arr[2][0] = rat;
                        avg_rev[0]+= rat;
                    }

                    else if(rev == 2) {

                        arr[2][1] = rat;
                        avg_rev[1]+= rat;
                    }

                    else if(rev == 3) {

                        arr[2][2] = rat;
                        avg_rev[2]+= rat;
                    }

                    else if(rev == 4) {

                        arr[2][3] = rat;
                        avg_rev[3]+= rat;
                    }

                }

//       if review is given to movie D


                else if(c == 'd' || c == 'D') {

                    if(rev == 1) {

                        arr[3][0] = rat;
                        avg_rev[0]+= rat;
                    }

                    else if(rev == 2) {

                        avg_rev[1]+= rat;
                        arr[3][1] = rat;
                    }

                    else if(rev == 3) {

                        arr[3][2] = rat;
                        avg_rev[2]+= rat;
                    }

                    else if(rev == 4) {

                        arr[3][3] = rat;
                        avg_rev[3]+= rat;
                    }


                }

//       if review is given to movie E


                else if(c == 'e' || c == 'E') {

                    if(rev == 1) {

                        arr[4][0] = rat;
                        avg_rev[0]+= rat;
                    }

                    else if(rev == 2) {

                        arr[4][1] = rat;
                        avg_rev[1]+= rat;
                    }

                    else if(rev == 3) {

                        arr[4][2] = rat;
                        avg_rev[2]+= rat;
                    }

                    else if(rev == 4) {

                        arr[4][3] = rat;
                        avg_rev[3]+= rat;
                    }


                }


            }
        }
        finally
        {
            s.close();
        }



//   calculate the average rating given by reviewer just by dividing by no. of movies

        for(int i=0;i<avg_rev.length;i++) {

            avg_rev[i] = avg_rev[i]/5;

        }


//   calculate the total no. of rating for a particular movie

        int total [] = new int[5];


        for(int j=0;j<arr.length;j++) {

            int sum =0;

            for(int i=0;i<arr[0].length;i++) {

                sum+=arr[j][i];

            }

            total[j] = sum;
        }

//   print

        System.out.println("\n Movies and Ratings : \n");


        System.out.println("Reviewers : 1 2 3 4");
        System.out.println("Movies ");

        for(int j=0;j<arr.length;j++) {

            System.out.print(" "+(char)('A'+j)+" ");

            for(int i=0;i<arr[0].length;i++) {

                System.out.print(arr[j][i]+" ");

            }

            System.out.println();


        }

        int max = 0;
        int index =0;

        System.out.println("\n\nTotal rating per Movies : \n");

        for(int i=0;i<total.length;i++) {

            System.out.println("Total rating by movie "+(char)('A'+i)+" is "+total[i]);

            if(max < total[i]) {
                max= total[i];
                index=i;
            }

        }

        System.out.println("\n\nMaximum Rating is given to movie : "+(char)('A'+index)+" is "+max);


        System.out.println("\n\nAverahe Rating per Reviewer : \n");

        for(int i=0;i<avg_rev.length;i++) {

            System.out.println("Average rating given by Reviewer "+(i+1)+" is "+avg_rev[i]);

        }




    }

}
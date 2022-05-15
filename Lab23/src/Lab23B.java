/*
 * Lab Assignment 23B Sorting
 * Weltron Bitange
 * This program uses Insertion Sort to sort through an array of objects
 * */
import java.util.*;
import java.io.*;
public class Lab23B {
    public static void main (String[] args) throws IOException{
        // Declare Scanner to read from file
        Scanner input = new Scanner(new File("Lab23B.txt"));
        // Declare array of 10 items
        Student[] students = new Student[10];
        int i = 0;
        // Read the input file
        while (input.hasNext()){
            String name = input.next();
            double gpa = input.nextDouble();
            //Insert contents to array
            students[i++] = new Student(name,gpa);
        }

        // Call insertion sort
        insertSort(students);
        // Loop through and print out contents of array
        for (Student student : students)
            System.out.println(student);
    }

    // Insertion Sort
    public static void insertSort(Student[] students){
        for (int i = 0; i < students.length; i++){
            Student index = students[i];
            int j;
            for (j = i - 1; j >= 0 && students[j].getGPA() > index.getGPA(); j--){
                students[j + 1] = students[j];
            }
            students[j + 1] = index;
        }
    }

}
// Student class
class Student{
    private final String Name;
    private final double GPA;

    public Student(String name, double GPA) {
        Name = name;
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return  "Name: " + Name + "\nGPA:  " + GPA;
    }
}

package Module_1_Programming_Fundamentals_Java_Basics;

import java.util.Scanner;

public class Student_Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a student marks: ");
        int marks = sc.nextInt();
        if(marks<0 || marks>100){
            System.out.println("Invalid marks");
        }
        switch(marks/10){
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
                break;

        }
    }
}

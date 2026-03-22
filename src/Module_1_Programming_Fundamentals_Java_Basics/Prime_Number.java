package Module_1_Programming_Fundamentals_Java_Basics;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        int c=2;
        if(num<=1){
            System.out.println("not prime nor composite");
        }
        while(c*c<=num){
            if(num%c ==0) {
                System.out.println("not prime number");
                return;
            }
            c+=1;
        }
        System.out.println("prime number");
    }
}

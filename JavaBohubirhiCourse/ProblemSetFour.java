package JavaBohubirhiCourse;

import java.util.Scanner;

// Write a java problem to calculate a leap year.

public class ProblemSetFour {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n=input.nextInt();

        System.out.println("Year is "+n);

        if((n%4==0)&&(n%100!=0)){
            System.out.println("Its a leap year");
        }
        else if(n%400==0){
            System.out.println("Its a leap year");
        }
        else{
            System.out.println("Its not a leap year.");
        }
    }
}

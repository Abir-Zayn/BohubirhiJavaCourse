package JavaBohubirhiCourse;


import java.util.Scanner;

/*
Ask a user to input a number . and show the number also its reverse

 */
public class ReverseNumber {
    public static void main(String[] args) {

        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=n;
        int reverse = 0;
        int remainder;

        while(q!=0) {
            remainder = q % 10;
            reverse = reverse * 10 + remainder;
            q = q / 10;
        }
        System.out.println("Added Number is: "+n);
        System.out.print("Reverse Number is: ");
        System.out.println(reverse);
    }
}

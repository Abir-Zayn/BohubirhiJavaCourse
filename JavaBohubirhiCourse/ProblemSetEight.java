package JavaBohubirhiCourse;


import java.util.Scanner;

//check if a number is a plaindrome or not.
/*

input =121

 */
public class ProblemSetEight {

    public static void isPalindrome(int q){
        int result = 0;
        int remainDigit= q;
        int remainder;


        while (remainDigit!=0) {
            remainder = remainDigit % 10;   // to get the remainder/The Last Digit
            result = result* 10 + remainder; //this helps to reverse the number {the last digit+......+the first digit}
            remainDigit = remainDigit / 10;  //this will helps to decrement the number

        }
       if(result== q){
           System.out.println("Its a plaindrome");
       }

    }

    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        isPalindrome(n);

    }
}

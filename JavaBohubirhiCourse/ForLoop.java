package JavaBohubirhiCourse;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // Find even numbers between 1 to 50 and calculate the sum of those numbers.

        int n=0;
        int sum=0;
        int oddsum=0;
        Scanner sc = new Scanner(System.in);  //Taking a number
        int q=sc.nextInt();

        System.out.println("This will print the even numbers sum");
        for (int i = 0; i <= q; i=i+2) {
            System.out.println("iteration "+i);
            sum =sum+i;
            System.out.println("Sum: "+sum);
        }
        System.out.println("Total Sum of even numbers: "+sum);

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("This will print the odd numbers sum");
        for(int i = 1; i<=q; i+=2){
            oddsum=oddsum+i;
            System.out.println(" iteration "+i);
            System.out.println("sum : "+oddsum);
        }
        System.out.println("Total Sum of Odd numbers: "+oddsum);
    }


}

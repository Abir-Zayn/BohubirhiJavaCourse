package JavaBohubirhiCourse;


import java.util.Scanner;
public class ProblemSetThree {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter Two Numbers(Float): ");
        float n=scan.nextFloat();
        float n2=scan.nextFloat();
        System.out.println("Float numbers are "+n+" and "+n2);

        int n3=(int)n;
        int n4=(int) n2;

        /* Converting to Integer
        System.out.println(n3);
        System.out.println(n4);
         */
        System.out.println("Output: ");

        //Swapping values
        int n5=n3;
        n3=n4;
        n4 = n5;
        System.out.println(n3);
        System.out.println(n4);


    }
}

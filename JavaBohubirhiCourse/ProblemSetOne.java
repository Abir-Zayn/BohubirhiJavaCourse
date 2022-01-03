package JavaBohubirhiCourse;

import java.util.Scanner;

public class ProblemSetOne {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        System.out.println("Enter two Numbers: ");
        double n1=input.nextDouble();
        double n2 = input.nextDouble();

        System.out.println("Using Operations: ");

        System.out.println("Addition ->"+(n1+n2));
        System.out.println("Subtraction ->"+(n1-n2));
        System.out.println("Multiplication ->"+(n1*n2));
        System.out.println("Division ->"+(n1/n2));
        System.out.println("Remainder ->"+(n1%n2));
        System.out.println("");
        System.out.println("Square of number 1 ->"+(n1*n1));
        System.out.println("Square of number 2 ->"+(n2*n2));
        System.out.println("Cube of number 1 ->"+(n1*n1*n1));
        System.out.println("Cube of number 2 ->"+(n2*n2*n2));
        System.out.println("Average: ->"+((n1+n2)/2));



    }
}

package JavaBohubirhiCourse;
import java.util.Scanner;

public class ProblemSetFive {
    public static void main(String[] args) {

        /*Three Sides of Triangle is given.We have to Check whether the triangle is
            Equilateral
            Isosceles
            Scalene
         */

        System.out.println("Enter 3 sided of triangle value: ");
        Scanner sc=new Scanner(System.in);

        int side1=sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if((side1==side2)&&(side1 == side3)){
            System.out.println("The triangle behaviour is Equilateral .");
        }else if(side2 == side3){
            System.out.println("The triangle behaviour is Isosceles.");
        }
        else if(side1==side2){
            System.out.println("The triangle behaviour is Isosceles.");
        }else if(side1==side3){
            System.out.println("The triangle behaviour is Isosceles.");
        }
        else{
            System.out.println("The triangle behaviour is Scalene");
        }

        sc.close();
    }
}

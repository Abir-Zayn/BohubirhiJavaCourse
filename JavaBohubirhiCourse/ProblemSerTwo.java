package JavaBohubirhiCourse;

import java.util.Scanner;
import java.lang.*;

public class ProblemSerTwo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a digit : ");

        char c = sc.next().charAt(0);

        int d=c;
        //int d=Integer.parseInt(c);
        //System.out.println(d);

        if((d>=65)&&(d<=90)){
            char z=(char)d;
            char z1=Character.toLowerCase(z);
            System.out.println(z1);
        }else{
            char z2=Character.toUpperCase(c);
            System.out.println(z2);
        }










    }
}

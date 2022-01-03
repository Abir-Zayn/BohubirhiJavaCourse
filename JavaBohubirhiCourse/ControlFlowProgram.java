package JavaBohubirhiCourse;

import java.util.Scanner;

public class ControlFlowProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int n=input.nextInt();
        if(n > 0){
            System.out.println("Its a positive Number ");
            if(n/2==0){
                System.out.println("Its a Even number");
            }
            else {
                System.out.println("Its a ODD number.");
            }
        }

    }
}

package JavaBohubirhiCourse;

import java.util.Scanner;

/*Check question above
 */
public class ProblemSetSix {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Tea and Candy.");
        int tea=input.nextInt();
        int candy=input.nextInt();

        if ((tea>=5)&&(candy >=5)){
            if((tea >=2*candy)||(candy >=2*tea)){
                int n=2;
                System.out.println("The party is great "+"("+(n)+")");
            }else {
                int n1 = 1;
                System.out.println("The Party is good " + "("+(n1)+")");
            }
        }
        else {
            int n2=0;
            System.out.println("The party is bad "+"("+(n2)+")");
        }
    }
}

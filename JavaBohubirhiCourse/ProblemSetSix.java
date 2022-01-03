package JavaBohubirhiCourse;

import java.util.Scanner;

/* We are having a party with amounts of tea and candy . Return the outcome of the party encoded as
0=bad, 1=good, 2=great.A party is good (1) ix both tea and candy are at least 5.However, if either
tea or candy is at least double the amount od the other one,the party is great(2) .However, in all cases
if either tea or candy is less than 5, the party is always bad.

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

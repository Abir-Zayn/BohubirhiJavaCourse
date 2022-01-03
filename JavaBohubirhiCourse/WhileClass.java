package JavaBohubirhiCourse;

public class WhileClass {
    public static void main(String[] args) {

        //Calculate the sum of 1 to 4;

        int n=0;
        int i = 0;

        while(i<=4){
            n=n+i; //0   0+1   1+2   3+3   6+4
            i=i+1; //  1     2     3     4
        }
        System.out.println(n);
    }
}

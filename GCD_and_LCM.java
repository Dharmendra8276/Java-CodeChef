/*
     NAME:- DHARMENDRA PRAJAPATI
     ID:- 20IT117
*/
package JavaProgramming2021;
import java.util.Scanner;

public class GCD_and_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();

            //int MAX = (A>B) ? A : B;

            int MAX;
            if(A>B){
                MAX = A;
            }
            else{
                MAX = B;
            }

            //GCD
            int gcd = 0;
            for(int j=1;j<MAX;j++){
                if((A%j == 0) && (B%j == 0)){
                    gcd = j;
                }
            }
            System.out.print(gcd+" ");

            //LCM
            while(true){
                if((MAX%A == 0) && (MAX%B == 0)){
                    System.out.println(MAX);
                    break;
                }
                else{
                    MAX++;
                }
            }
        }
    }
}

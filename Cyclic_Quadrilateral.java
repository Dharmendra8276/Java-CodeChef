package JavaProgramming2021;

import java.util.Scanner;

public class Cyclic_Quadrilateral {
    public static void main(String[] args) {
        Scanner dc = new Scanner(System.in);

        int T = dc.nextInt();
        while(T-- > 0){
            int A = dc.nextInt(), B = dc.nextInt(), C = dc.nextInt(), D = dc.nextInt();
            int sum1 = A+C, sum2 = B+D;

            if(sum1 == 180 && sum2 == 180){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        dc.close();
    }
}

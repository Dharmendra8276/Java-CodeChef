package JavaProgramming2021;

import java.util.Scanner;

public class Alternating_Work_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int A = sc.nextInt(), B = sc.nextInt();
            int P = sc.nextInt(), Q = sc.nextInt();

            if(P%A == 0 && Q%B == 0){
                int m = P/A;
                int n = Q/B;
                if((m-n) == 1 || (n-m) == 1 || (m-n) == 0 || (n-m) == 0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }

        }
        sc.close();
    }
}
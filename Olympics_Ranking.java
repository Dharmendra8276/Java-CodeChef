package JavaProgramming2021;

import java.util.Scanner;

public class Olympics_Ranking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int G1 = sc.nextInt(), S1 = sc.nextInt(), B1 = sc.nextInt();
            int G2 = sc.nextInt(), S2 = sc.nextInt(), B2 = sc.nextInt();

            int sum1 = G1+S1+B1;
            int sum2 = G2+S2+B2;
            if(sum1 > sum2){
                System.out.println("1");
            }
            else{
                System.out.println("2");
            }
        }
        sc.close();
    }
}

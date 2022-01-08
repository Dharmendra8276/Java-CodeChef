package JavaProgramming2021;

import java.util.Scanner;

public class Odd_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int sum = 0;
            if(N<3){
                System.out.println("1");
            }
            else{
                N = N - 1;
                sum = (N*N)-N+1;
                System.out.println(sum);
            }
        }
        sc.close();
    }
}

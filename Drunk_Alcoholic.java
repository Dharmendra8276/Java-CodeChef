package JavaProgramming2021;

import java.util.Scanner;

public class Drunk_Alcoholic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0) {
            int K = sc.nextInt();
            int sum = 0;
            for(int i=1;i<=K;i++){
                if(i%2 != 0){
                    sum = sum+3;
                }
                else{
                    sum = sum-1;
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}

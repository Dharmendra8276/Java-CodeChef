package JavaProgramming2021;

import java.util.Scanner;

public class Add_Natural_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long sum = 0;
        long N = sc.nextLong();
        N = Math.abs(N);

        if(N>=1 && N<=1000000000){
            for(int i=1;i<=N;i++){
                sum = sum+i;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
package JavaProgramming2021;

import java.util.Scanner;

public class Exactly_N_Plus_1_Values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            long n = (long) Math.pow(2,N);
            int count = 1;

            System.out.print("1 ");
            for(int i=1;i<N;i++){
                System.out.print(i+" ");
                count = count+i;
            }
            System.out.println((n-count));
        }
        sc.close();
    }
}
package JavaProgramming2021;

import java.util.Scanner;

public class Alternative_Square_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = -4;

        for(int i=1;i<=N;i++){
            if(i%2 != 0){
                k += 4;
                for(int j=1;j<=5;j++){
                    System.out.print(++k+" ");
                }
                System.out.println();
            }
            else{
                k += 6;
                for(int j=1;j<=5;j++){
                    System.out.print(--k+" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

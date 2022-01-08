package JavaProgramming2021;

import java.util.Scanner;

public class ColdPlay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int M = sc.nextInt();
            int S = sc.nextInt();

            int cnt = M/S;
            System.out.println(cnt);
        }
    }
}

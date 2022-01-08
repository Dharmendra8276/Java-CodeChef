package JavaProgramming2021;

import java.util.Scanner;

public class Judging_Delay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++){
            int N = sc.nextInt();
            int mnt = 0;

            for(int j=0;j<N;j++){
                int S = sc.nextInt();
                int J = sc.nextInt();


                int cnt = Math.abs(J-S);
                if(cnt>5){
                    mnt++;
                }
            }
            System.out.println(mnt);
        }
    }
}

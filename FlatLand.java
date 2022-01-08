package JavaProgramming2021;

import java.util.Scanner;

public class FlatLand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int mnt = 0;

            while(N != 0){
                int cnt = 1;
                int maximum = 0;
                while(cnt*cnt <= N){
                    maximum = Math.max(maximum, cnt*cnt);
                    cnt++;
                }
                N = N-maximum;
                mnt++;
            }

            System.out.println(mnt);

        }
        sc.close();
    }
}

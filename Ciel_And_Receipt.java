package JavaProgramming2021;

import java.util.Scanner;

public class Ciel_And_Receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int p = sc.nextInt();
            int cnt = 0;
            for(int i=11;i>=0;i--){
                int pow = (int)Math.pow(2,i);
                while(p >= pow){
                    p -= pow;
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}

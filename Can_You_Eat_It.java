package JavaProgramming2021;

import java.util.Scanner;

public class Can_You_Eat_It {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), K = sc.nextInt();

            if(N%K == 0){
                int l = N/K;
                System.out.println(l);
            }
            else{
                System.out.println("-1");
            }
        }
        sc.close();
    }
}
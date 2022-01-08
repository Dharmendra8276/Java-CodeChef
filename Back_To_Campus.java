package JavaProgramming2021;

import java.util.Scanner;

public class Back_To_Campus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), K = sc.nextInt();
            int count = 0;

            while(N>0){
                N = N-K;
                count++;
            }

            System.out.println(count);
        }
        sc.close();
    }
}

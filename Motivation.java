package JavaProgramming2021;

import java.util.Arrays;
import java.util.Scanner;

public class Motivation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), X = sc.nextInt();
            int []S = new int[N];
            int []R = new int[N];
            for(int i=0;i<N;i++){
                int s = sc.nextInt(), r = sc.nextInt();
                if(s <= X){
                    S[i] = s;
                    R[i] = r;
                }
            }

            Arrays.sort(R);
            System.out.println(R[R.length-1]);

        }
        sc.close();
    }
}

package JavaProgramming2021;

import java.util.Arrays;
import java.util.Scanner;

public class Buying_New_Tablet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        //int []arr = new int[T];

        for(int i=0;i<T;i++){
            int N = sc.nextInt();
            int B = sc.nextInt();

            int []str = new int[N];
            int count = 0;
            for(int j=0;j<N;j++){
                int W = sc.nextInt();
                int H = sc.nextInt();
                int P = sc.nextInt();
                if(P<=B){
                    str[j] = W*H;
                }
                else{
                    count++;
                }
            }
            Arrays.sort(str);
            if(count == N){
                System.out.println("no tablet");
            }
            else{
                System.out.println(str[N-1]);

            }
        }
    }
}

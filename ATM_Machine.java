package JavaProgramming2021;

import java.util.Scanner;

public class ATM_Machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), K = sc.nextInt();
            int []arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }

            for(int i=0;i<N;i++){
                if(arr[i] <= K){
                    System.out.print("1");
                    K = K-arr[i];
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

package JavaProgramming2021;

import java.util.Scanner;

public class A_Subtask_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), M = sc.nextInt(), K = sc.nextInt();
            int []arr = new int[N];
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            int cnt = 0, mnt = 0;
            for(int j=0;j<N;j++){
                if(arr[j] == 1){
                    cnt++;
                }
            }
            if(cnt == N){
                System.out.println("100");
            }
            else{
                for(int l=0;l<M;l++){
                    if(arr[l] == 1){
                        mnt++;
                    }
                }
                if(mnt == M){
                    System.out.println(K);
                }
                else{
                    System.out.println("0");
                }
            }
        }
        sc.close();
    }
}

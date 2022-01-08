package JavaProgramming2021;

import java.util.Scanner;

public class Chef_In_Vaccination_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//   0 --> child --> X   1 --> elder --> Y
        int T = sc.nextInt();
        while(T-- > 0){
            int sum = 0;
            int N = sc.nextInt(), P = sc.nextInt(), X = sc.nextInt(), Y = sc.nextInt();
            int []arr = new int[N];
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }

            for(int j=0;j<P;j++){
                if(arr[j] == 0){
                    sum = sum+X;
                }
                if(arr[j] == 1){
                    sum = sum+Y;
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}

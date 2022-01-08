package JavaProgramming2021;

    // This problem is partially Solved

import java.util.Scanner;

public class Even_Pair_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int A = sc.nextInt();
            int B = sc.nextInt();

            long count = 0;
            for(int i=1;i<=A;i++){
                for(int j=1;j<=B;j++){
                    int sum = i+j;
                    if(sum%2 == 0){
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}

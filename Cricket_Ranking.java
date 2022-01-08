package JavaProgramming2021;

import java.util.Scanner;

public class Cricket_Ranking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int a = 0, b = 0;
            int [] A = new int[3], B = new int[3];
            for(int i=0;i<3;i++){
                A[i] = sc.nextInt();
            }

            for(int i=0;i<3;i++){
                B[i] = sc.nextInt();
            }

            for(int i=0;i<3;i++){
                if(A[i] > B[i]){
                    a++;
                }
                else{
                    b++;
                }
            }

            if(a > b){
                System.out.println("A");
            }
            else{
                System.out.println("B");
            }

        }
        sc.close();
    }
}

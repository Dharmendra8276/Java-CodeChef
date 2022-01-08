package JavaProgramming2021;

import java.util.Scanner;

public class Cars_And_Bikes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int temp = 0;

        for(int i=0;i<T;i++){
            int N = sc.nextInt();
            temp = N;

            if(temp%4 == 0){
                temp = N%4;
            }
            if(temp == 0){
                System.out.println("NO");
            }
            else if(temp%2 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

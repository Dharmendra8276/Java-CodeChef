package JavaProgramming2021;

import java.util.Scanner;

public class Pass_Or_Fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(), X = sc.nextInt(), P = sc.nextInt();
            int mul = X*3 - (N-X);
            if(mul >= P){
                System.out.println("PASS");
            }
            else{
                System.out.println("FAIL");
            }
        }
        sc.close();
    }
}
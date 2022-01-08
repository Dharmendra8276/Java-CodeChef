package JavaProgramming2021;

import java.util.Scanner;

public class Game_Between_Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt();
            if(A >= B){
                B += C;
            }
            else{
                A += C;
            }

            if(A >= B){
                B += D;
            }
            else{
                A += D;
            }

            if(A >= B){
                System.out.println("N");
            }
            else{
                System.out.println("S");
            }
        }
        sc.close();
    }
}

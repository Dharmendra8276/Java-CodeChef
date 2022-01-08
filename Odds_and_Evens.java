package JavaProgramming2021;

import java.util.Scanner;

public class Odds_and_Evens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a+b;
            if(sum%2 == 0){
                System.out.println("Bob");
            }
            else{
                System.out.println("Alice");
            }
        }
        sc.close();
    }
}

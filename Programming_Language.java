package JavaProgramming2021;

import java.util.Scanner;

public class Programming_Language {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int A = sc.nextInt(), B = sc.nextInt();
            int A1 = sc.nextInt(), B1 = sc.nextInt();
            int A2 = sc.nextInt(), B2 = sc.nextInt();

            if((A == A1 && B == B1) || (A == B1 && B == A1)){
                System.out.println("1");
            }
            else if((A == A2 && B == B2) || (A == B2 && B == A2)){
                System.out.println("2");
            }
            else{
                System.out.println("0");
            }
        }
        sc.close();
    }
}

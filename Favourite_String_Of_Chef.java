package JavaProgramming2021;

import java.util.Scanner;

public class Favourite_String_Of_Chef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            String S = sc.next();
            if(S.length() == N){
                if(S.indexOf("code") < S.indexOf("chef")){
                    System.out.println("AC");
                }
                else{
                    System.out.println("WA");
                }
            }
        }
        sc.close();
    }
}

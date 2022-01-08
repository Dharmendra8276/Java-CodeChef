package JavaProgramming2021;

import java.util.Scanner;

public class Equal_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
        long X = sc.nextInt(), Y = sc.nextInt();
            if(X == 0 && Y%2 == 0){
                System.out.println("YES");
                continue;
            }
            else if(X==0 && Y%2 != 0) {
                System.out.println("NO");
                continue;
            }

            if((X+2*Y)%2 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

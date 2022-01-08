package JavaProgramming2021;

import java.util.Scanner;

public class Gold_Mining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int X = sc.nextInt(), Y = sc.nextInt();

            int mul = (N+1)*Y;

            if(mul < X){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        sc.close();
    }
}

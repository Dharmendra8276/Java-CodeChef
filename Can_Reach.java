package JavaProgramming2021;

import java.util.Scanner;

public class Can_Reach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int x = sc.nextInt(), y = sc.nextInt();
            int K = sc.nextInt();

            if(x%K == 0 && y%K == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

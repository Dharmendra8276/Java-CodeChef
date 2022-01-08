package JavaProgramming2021;

import java.util.Scanner;

public class Dance_Moves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt();
            boolean cnt = true;
            int mnt = 0;
            while(cnt){
                if(X<Y){
                    X = X+2;
                    mnt++;
                    cnt = true;
                }
                else if(X>Y){
                    X = X-1;
                    mnt++;
                    cnt = true;
                }
                else{
                    cnt = false;
                }
            }
            if(X == Y){
                System.out.println(mnt);
            }
            else{
                if(X>Y){
                    X = X-1;
                    mnt++;
                }
                System.out.println(mnt);
            }
        }
        sc.close();
    }
}

package JavaProgramming2021;

import java.util.Scanner;

public class Playing_With_Matches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int A = sc.nextInt(), B = sc.nextInt();
            int sum = A + B;
            int cnt = 0;

            for(int i=0;i<String.valueOf(sum).length();i++){
                int n = String.valueOf(sum).charAt(i);
                if(n == '0' || n == '6' || n == '9'){
                    cnt = cnt+6;
                }
                if(n == '2' || n == '3' || n == '5'){
                    cnt = cnt+5;
                }
                if(n == '1'){
                    cnt = cnt+2;
                }
                if(n == '4'){
                    cnt = cnt+4;
                }
                if(n == '7'){
                    cnt = cnt+3;
                }
                if(n == '8'){
                    cnt = cnt+7;
                }
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}

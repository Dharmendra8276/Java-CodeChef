package JavaProgramming2021;

import java.util.Scanner;

public class Chef_And_Salary_Pay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt();
            String sr = sc.next();
            int cnt = 0;
            int mnt = 0 , max = 0;

            for(int i=0;i<sr.length();i++) {
                char l = sr.charAt(i);
                if (l == '1') {
                    cnt++;
                    mnt++;
                    if(mnt >= max){
                        max = mnt;
                    }
                }
                else{
                    mnt = 0;
                }
            }
            System.out.println(cnt*X + max*Y);
        }
        sc.close();
    }
}
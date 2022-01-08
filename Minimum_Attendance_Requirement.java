package JavaProgramming2021;

import java.util.Scanner;

public class Minimum_Attendance_Requirement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            String str = sc.next();
            int l = str.length();

            if(N == l){
                int leaves = 0;
                for(int j=0;j<l;j++){
                    int a = str.charAt(j);
                    if(a == '0'){
                        leaves++;
                    }
                }
                if(leaves > 30){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
        }
        sc.close();
    }
}

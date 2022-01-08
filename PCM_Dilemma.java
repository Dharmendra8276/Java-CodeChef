package JavaProgramming2021;

import java.util.Scanner;

public class PCM_Dilemma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            String str = sc.next();

            if(str.contains("P") && str.contains("C") && str.contains("M")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

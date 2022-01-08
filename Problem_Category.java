package JavaProgramming2021;

import java.util.Scanner;

public class Problem_Category {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        if(T>=1 && T<=50){
            while(T-- > 0){
                int x = sc.nextInt();
                if(x>=1 && x<=300){
                    if(x>=1 && x<100){
                        System.out.println("Easy");
                    }
                    else if(x>=100 && x<200){
                        System.out.println("Medium");
                    }
                    else{
                        System.out.println("Hard");
                    }
                }
            }
        }
        sc.close();
    }
}

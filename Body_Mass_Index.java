package JavaProgramming2021;

import java.util.Scanner;

public class Body_Mass_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int M = sc.nextInt();
            int H = sc.nextInt();
            int all = M/(H*H);
//            System.out.println(all);

            if(all <= 18){
                System.out.println("1");
            }
            if(all >= 19 && all <= 24){
                System.out.println("2");
            }
            if(all >= 25 && all <= 29){
                System.out.println("3");
            }
            if(all >= 30){
                System.out.println("4");
            }
        }
        sc.close();
    }
}

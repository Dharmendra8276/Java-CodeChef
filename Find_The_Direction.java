package JavaProgramming2021;

import java.util.Scanner;

public class Find_The_Direction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0){
            int N = sc.nextInt();
            int a = N%4;
            if(a == 0){
                System.out.println("North");
            }
            else if(a == 1){
                System.out.println("East");
            }
            else if(a == 2){
                System.out.println("South");
            }
            else if(a == 3){
                System.out.println("West");
            }
        }
        sc.close();
    }
}

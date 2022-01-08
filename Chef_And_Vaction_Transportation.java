package JavaProgramming2021;

import java.util.Scanner;

public class Chef_And_Vaction_Transportation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), Y = sc.nextInt(), Z = sc.nextInt();
            int sum = X+Y;
            if(sum > Z){
                System.out.println("TRAIN");
            }
            else if(sum < Z){
                System.out.println("PLANEBUS");
            }
            else{
                System.out.println("EQUAL");
            }
        }
        sc.close();
    }
}

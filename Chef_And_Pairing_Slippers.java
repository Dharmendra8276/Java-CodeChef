package JavaProgramming2021;

import java.util.Scanner;

public class Chef_And_Pairing_Slippers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int total = sc.nextInt();
            int left = sc.nextInt();
            int price = sc.nextInt();

            int right = total-left;
            if(right > left){
                System.out.println(left*price);
            }
            else{
                System.out.println(right*price);
            }
        }
        sc.close();
    }
}

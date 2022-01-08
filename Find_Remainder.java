package JavaProgramming2021;

import java.util.Scanner;

public class Find_Remainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i=0;i<N;i++){
            int A = scan.nextInt();
            int B = scan.nextInt();

            int reminder = A%B;
            System.out.println(reminder);
        }
    }
}
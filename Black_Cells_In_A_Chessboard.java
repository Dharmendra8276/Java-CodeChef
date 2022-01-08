package JavaProgramming2021;

import java.util.Scanner;

public class Black_Cells_In_A_Chessboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N%2 == 0){
            int sum = N*N;
            System.out.println(sum/2);
        }
        sc.close();
    }
}

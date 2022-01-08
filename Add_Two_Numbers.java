package JavaProgramming2021;

import java.util.Scanner;

public class Add_Two_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Total Iteration: ");
        int I = input.nextInt();
        int a, b, total;

        for(int i = 0;i<I;i++){
            a = input.nextInt();
            b = input.nextInt();
            total = a + b;
            System.out.println("Total = "+ total);
        }
    }
}

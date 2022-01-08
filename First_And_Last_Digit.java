package JavaProgramming2021;

import java.util.Scanner;

public class First_And_Last_Digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int N = input.nextInt();
        for(int i=0;i<N;i++){
            int total, temp = 0;
            int number = input.nextInt();
            int reminder = number%10;
            while(number>0){
                temp = number%10;
                number = number/10;

            }
            total = reminder + temp;
            System.out.println(total);
        }
    }
}
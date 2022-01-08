package JavaProgramming2021;
import java.util.Scanner;

public class Helping_Chef {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        if(N>=1 && N<=1000){
            for(int i=0;i<N;i++){
                int number = input.nextInt();
                if (number >= -20 && number <= 20) {
                    if (number <= 10) {
                        System.out.println("Thanks for helping Chef!");
                    } else {
                        System.out.println("-1");
                    }
                }
            }
        }
    }
}
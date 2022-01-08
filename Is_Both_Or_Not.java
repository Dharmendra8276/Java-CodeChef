package JavaProgramming2021;

import java.util.Scanner;

public class Is_Both_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if((N%5 == 0) && (N%11 == 0)){
            System.out.println("BOTH");
        }
        else if((N%5 == 0) || (N%11 == 0)){
            System.out.println("ONE");
        }
        else{
            System.out.println("NONE");
        }
        sc.close();
    }
}

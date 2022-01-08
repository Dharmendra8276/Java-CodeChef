package JavaProgramming2021;

import java.util.Scanner;

public class Buy_Please {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
        System.out.println((a*x + b*y));
        sc.close();
    }
}

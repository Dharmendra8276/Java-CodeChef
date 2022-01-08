package JavaProgramming2021;
import java.util.Scanner;

public class Chef_And_Remissness {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        if(N >=1 && N <= 100) {
            for (int i = 0; i < N; i++) {

                int A = input.nextInt();
                int B = input.nextInt();
                if ((A >= 0 && A <= 1000000) && (B >= 0 && B <= 1000000)) {
                    int sum = 0;

                    sum = A + B;
                    if(A > B) {
                        System.out.println(A + " " + sum);
                    }
                    else {
                        System.out.println(B + " " + sum);
                    }
                }
            }
        }
    }
}
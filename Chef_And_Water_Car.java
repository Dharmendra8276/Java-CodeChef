package JavaProgramming2021;

import java.util.Scanner;

class Chef_And_Water_Car {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        while (T-- > 0) {
            long N = s.nextLong();
            long V = s.nextLong();
            long max = 0, min = 0;

            max = ((N - 1) * N) / 2;
            if (V == 1)
                min = max;
            else {
                if (V >= N - 1)
                    min = N - 1;
                else
                    min += V + ((N - V) * (N - V + 1)) / 2 - 1;
            }
            System.out.println(max + " " + min);
        }
    }
}

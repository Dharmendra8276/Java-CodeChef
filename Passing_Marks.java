package JavaProgramming2021;

import java.util.Scanner;

public class Passing_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int Amin = sc.nextInt(), Bmin = sc.nextInt(), Cmin = sc.nextInt();
            int Tmin = sc.nextInt();
            int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
            int sum = A+B+C;

            if(sum >= Tmin && A >=Amin && B >= Bmin && C >= Cmin){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

package JavaProgramming2021;

import java.util.Scanner;

public class Pair_Me {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();
        while(testcase-- > 0){
            int fNumber = sc.nextInt(), sNumber = sc.nextInt(), tNumber = sc.nextInt();
            if((fNumber+sNumber == tNumber) || (fNumber+tNumber == sNumber) || (sNumber+tNumber == fNumber)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

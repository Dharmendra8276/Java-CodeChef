package JavaProgramming2021;

import java.util.Scanner;

public class Chef_And_SnackDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int []arr = {2010, 2015, 2016, 2017, 2019};

        while(T-- > 0){
            int N = sc.nextInt();

            if(N == arr[0] || N == arr[1] || N == arr[2] || N == arr[3] || N == arr[4]){
                System.out.println("HOSTED");
            }
            else{
                System.out.println("NOT HOSTED");
            }
        }
    }
}

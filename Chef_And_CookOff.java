package JavaProgramming2021;

import java.util.Scanner;

public class Chef_And_CookOff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int []arr = new int[5];
        for(int i=0;i<N;i++){
            int sum = 0;
            for(int j=0;j<arr.length;j++){
                arr[j] = in.nextInt();
                sum += arr[j];
            }

            if(sum == 0){
                System.out.println("Beginner");
            }
            if(sum == 1){
                System.out.println("Junior Developer");
            }
            if(sum == 2){
                System.out.println("Middle Developer");
            }
            if(sum == 3){
                System.out.println("Senior Developer");
            }
            if(sum == 4){
                System.out.println("Hacker");
            }
            if(sum == 5){
                System.out.println("Jeff Dean");
            }
        }
    }
}

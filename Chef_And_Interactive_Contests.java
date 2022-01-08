package JavaProgramming2021;

import java.util.Scanner;

public class Chef_And_Interactive_Contests {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt(), r = in.nextInt();
        for(int i=0;i<N;i++){
            int R = in.nextInt();
            if(R >= r){
                System.out.println("Good boi");
            }
            else{
                System.out.println("Bad boi");
            }
        }
        in.close();
    }
}

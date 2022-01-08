package JavaProgramming2021;

import java.util.Scanner;

class Result{
    static int Farmer(int length, int width){
        int mul = length*width;
        int n = 1;

        for(int i=1;i<=length && i<=width;i++){
            if(length%i ==0 && width%i ==0){
                n = mul/(i*i);
            }
        }
        return n;
    }
}
public class Farmer_And_His_Plot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            int length = sc.nextInt();
            int width = sc.nextInt();

            int result = Result.Farmer(length, width);

            System.out.println(result);
        }
    }
}

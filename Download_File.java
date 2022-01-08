package JavaProgramming2021;

import java.util.Scanner;

public class Download_File {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        while(T-- > 0){
            int N = in.nextInt(), K = in.nextInt();

            int sum = 0;
            for(int i=0;i<N;i++){
                int Ti = in.nextInt(), Di = in.nextInt();

                if(Ti <= K){
                    K = K-Ti;
                }
                else{
                    sum += (Ti-K)*Di;
                    K = 0;
                }

            }
            System.out.println(sum);
        }
        in.close();
    }
}

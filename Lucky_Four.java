package JavaProgramming2021;

import java.util.Scanner;

public class Lucky_Four {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for(int i=0;i<N;i++){
            //int [] num = new int[N];
            String str = scan.next();
            int count = 0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == '4'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

package JavaProgramming2021;

import java.util.Scanner;

public class Good_Weather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int []arr = new int[7];

        while(T-- > 0){

            int zero = 0, one = 0;
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }

            for(int j=0;j<arr.length;j++){
                if(arr[j] == 1){
                    one++;
                }
                else{
                    zero++;
                }
            }

            if(one > zero){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

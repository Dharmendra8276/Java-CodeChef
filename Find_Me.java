package JavaProgramming2021;

import java.util.Scanner;

public class Find_Me {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        int N = sc.nextInt(), k = sc.nextInt();
        int []arr = new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int j=0;j<arr.length;j++){
            if(arr[j] == k){
                cnt++;
            }
        }
        if(cnt != 0){
            System.out.println("1");
        }
        else{
            System.out.println("-1");
        }
        sc.close();
    }
}

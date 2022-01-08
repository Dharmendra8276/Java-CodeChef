package JavaProgramming2021;

import java.util.Scanner;

public class Average_Flex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int []arr = new int[N];
            for(int i=0;i<arr.length;i++) {
                arr[i] = sc.nextInt();
            }

            int count = 0;
            for(int j=0;j<arr.length;j++){
                int t = arr[j];
                int cnt = 0, mnt = 0;
                for(int l=0;l<arr.length;l++){
                    if(t >= arr[l]){
                        cnt++;
                    }
                    else{
                        mnt++;
                    }
                }
                if(cnt > mnt){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}

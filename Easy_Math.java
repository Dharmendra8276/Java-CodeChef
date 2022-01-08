package JavaProgramming2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Easy_Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int[] A = new int[N];
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int i=0;i<A.length;i++){
                A[i] = sc.nextInt();
            }

            for(int i=0;i<A.length-1;i++){
                for(int j=i+1;j<A.length;j++){
                    int y = A[i]*A[j];
                    arr.add(y);
                }
            }

            int[] Asum = new int[arr.size()];
            for(int l=0;l<arr.size();l++){
                int sum = 0;
                int m = arr.get(l);
                while(m > 0){
                    int reminder = m%10;
                    sum += reminder;
                    m = m/10;
                }
                Asum[l] = sum;

            }

//            Arrays.sort(Asum);
            System.out.println(Asum[Asum.length-1]);
        }
        sc.close();
    }
}

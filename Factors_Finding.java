package JavaProgramming2021;

import java.util.ArrayList;
import java.util.Scanner;

public class Factors_Finding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();

        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            if(N%i == 0){
                cnt++;
                list.add(i);
            }
        }

        System.out.println(cnt);
        for(int j=0;j<list.size();j++){
            System.out.print(list.get(j)+" ");
        }
        sc.close();
    }
}
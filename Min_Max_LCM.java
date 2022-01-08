package JavaProgramming2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

        //This program create time limit error

public class Min_Max_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int X = sc.nextInt(), K = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            int l = X*K;
            if(l<=1000000000){
                for(int i=X;i<l;i++){
                    for(int j=i+1;j<=l;j++){
                        int ans = j;
                        while(true){
                            if(ans%i == 0 && ans%j == 0){
                                list.add(ans);
                                break;
                            }
                            ans++;
                        }
                    }
                }
            }

            Collections.sort(list);
            System.out.println(list.get(0)+" "+list.get(list.size()-1));
        }
        sc.close();
    }
}
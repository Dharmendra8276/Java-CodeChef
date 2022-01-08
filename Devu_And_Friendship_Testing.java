package JavaProgramming2021;

import java.util.HashSet;
import java.util.Scanner;

public class Devu_And_Friendship_Testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            HashSet<Integer> fr = new HashSet<>();
            for(int i=0;i<n;i++){
                fr.add(sc.nextInt());
            }

            System.out.println(fr.size());

        }
        sc.close();
    }
}

package JavaProgramming2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Find_Second_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
        list.add(A);
        list.add(B);
        list.add(C);
        Collections.sort(list);

        System.out.println(list.get(1));
        sc.close();
    }
}

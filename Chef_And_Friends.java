package JavaProgramming2021;

import java.util.Scanner;

public class Chef_And_Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //String []arr = new String[N];
        int count = 0;
        for(int i=0;i<N;i++){
            // arr[i] = sc.next();
            String name = sc.next();
            if(name.contains("ch") || name.contains("he") || name.contains("ef") || name.contains("che") || name.contains("hef") || name.contains("chef")){
                count++;
            }
        }
        System.out.println(count);
    }
}

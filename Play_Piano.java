package JavaProgramming2021;

import java.util.Scanner;

public class Play_Piano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            String s = sc.next();
            int length = s.length();

            if(length%2 == 0){
                boolean position = true;
                for(int i=0;i<length;i+=2){
                    if(s.charAt(i) == s.charAt(i+1)){
                        position = false;
                        break;
                    }
                }

                if(position){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
            }
            else{
                System.out.println("no");
            }
        }
        sc.close();
    }
}

package JavaProgramming2021;

import java.util.Scanner;

public class Chef_And_The_Wildcard_Matching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            String X = sc.next(), Y = sc.next();
            int count = 0;
            if(X.length() == Y.length()){
                for(int i=0;i<X.length();i++){
                    if(X.charAt(i) == Y.charAt(i)){
                        count++;
                    }
                    else if(X.charAt(i) == '?' || Y.charAt(i) == '?'){
                        count++;
                    }
                }
                if(count == X.length()){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }
        sc.close();
    }
}

package JavaProgramming2021;

import java.util.Scanner;

public class Chef_And_Stock_Prices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0){
            float S = sc.nextInt();
            float A = sc.nextInt(), B = sc.nextInt();
            float C = sc.nextInt();

            float price = S + ((S*C)/100);

            if(price >= A && price <=B){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

package JavaProgramming2021;

import java.util.Scanner;

public class How_much_Scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        if(R <= 50){
            System.out.println("100");
        }
        else if(R > 50 && R <= 100){
            System.out.println("50");
        }
        else{
            System.out.println("0");
        }
        sc.close();
    }
}

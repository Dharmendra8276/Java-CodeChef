package JavaProgramming2021;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = scan.nextDouble();
        System.out.println("Your Total Balance Is: "+ total);
        System.out.print("Enter The Amount Which You Want To Withdraw: ");
        long cash = scan.nextLong();


            if (cash % 5 == 0 && total-cash>=0.5) {
                total = total - cash - 0.50;
                System.out.println("Your Transaction Is Successfully, Please Wait");
                System.out.printf("Your Total Balance Is : %.2f", total);
            }
        else{
                System.out.println("Please Enter Valid Amount");
                System.out.printf("Your Total Balance Is : %.2f", total);
        }
    }
}

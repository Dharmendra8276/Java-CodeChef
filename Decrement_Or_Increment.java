package JavaProgramming2021;
import java.util.Scanner;

public class Decrement_Or_Increment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        if(number%4 == 0){
            number++;
            System.out.println(number);
        }
        else{
            number--;
            System.out.println(number);
        }
    }
}

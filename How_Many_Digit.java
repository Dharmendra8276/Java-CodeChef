package JavaProgramming2021;
import java.util.Scanner;

public class How_Many_Digit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        int len = name.length();
        if (len == 1) {
            System.out.println("1");
        }
        else if(len == 2){
            System.out.println("2");
        }
        else if(len == 3){
            System.out.println("3");
        }
        else{
            System.out.println("More than 3 digits");
        }
    }
}

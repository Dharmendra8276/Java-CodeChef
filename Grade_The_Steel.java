package JavaProgramming2021;
import java.util.Scanner;

public class Grade_The_Steel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i=0;i<N;i++){
            int hard = scan.nextInt();
            float carbon = scan.nextFloat();
            int tensile = scan.nextInt();

            if(hard>50 && carbon<0.7 && tensile>5600){
                System.out.println("10");
            }
            else if(hard>50 && carbon<0.7){
                System.out.println("9");
            }
            else if(carbon<0.7 && tensile>5600){
                System.out.println("8");
            }
            else if(hard>50 && tensile>5600){
                System.out.println("7");
            }
            else if(hard>50 || tensile>5600 ||carbon<0.7){
                System.out.println("6");
            }
            else{
                System.out.println("5");
            }
        }
    }
}

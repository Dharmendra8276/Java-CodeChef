package JavaProgramming2021;
import java.util.Scanner;

public class Area_Or_Perimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();
        int breadth = scan.nextInt();

        int Area  = length*breadth;
        int Perimeter = 2*(length + breadth);

        if(Area > Perimeter){
            System.out.println("Area\n" + Area);
        }
        else if(Area < Perimeter){
            System.out.println("Peri\n" + Perimeter);
        }
        else{
            System.out.println("Eq\n" + Area);
        }
    }
}

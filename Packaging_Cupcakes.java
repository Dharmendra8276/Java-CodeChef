package JavaProgramming2021;
import java.util.Scanner;

public class Packaging_Cupcakes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        for(int i=0;i<N;i++){
            int cake = scan.nextInt();
            if(cake == 1 || cake == 2)
            {
                System.out.println(cake);
            }
            else{
                System.out.println(cake/2+1);
            }
        }
    }
}

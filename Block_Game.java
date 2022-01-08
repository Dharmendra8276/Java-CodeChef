/*
     Name:- PRAJAPATI DHARMENDRA
     ID:- 20IT117
*/

package JavaProgramming2021;
import java.util.Scanner;

public class Block_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int number = sc.nextInt();
            int newnumber = number;

            int palin = 0;

            while(newnumber!=0){
                int modul = newnumber%10;
                palin = palin*10 + modul;
                newnumber = newnumber/10;
            }
            if(palin == number){
                System.out.println("wins");
            }
            else{
                System.out.println("loses");
            }
        }
    }
}

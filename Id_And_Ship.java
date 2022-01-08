/*
     NAME:- DHARMENDRA PRAJAPATI
     ID:- 20IT117
*/
package JavaProgramming2021;
import java.util.Scanner;

public class Id_And_Ship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            String alphbet = sc.next();

            if(alphbet.equalsIgnoreCase("b")){
                System.out.println("BattleShip");
            }
            if(alphbet.equalsIgnoreCase("c")){
                System.out.println("Cruiser");
            }
            if(alphbet.equalsIgnoreCase("d")){
                System.out.println("Destroyer");
            }
            if(alphbet.equalsIgnoreCase("f")){
                System.out.println("Frigate");
            }
        }
    }
}
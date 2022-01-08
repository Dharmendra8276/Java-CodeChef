package JavaProgramming2021;
import java.util.Scanner;

public class Mahasena {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int cnt = 0;
        int mnt = 0;
        for(int i=0;i<N;i++){
            int num = in.nextInt();
            if(num%2 == 0){
                cnt++;
                //Lucky
            }
            else{
                mnt++;
                //Unlucky
            }
        }
        if(cnt > mnt){
            System.out.println("READY FOR BATTLE");
        }
        else{
            System.out.println("NOT READY");
        }
    }
}

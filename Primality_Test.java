/*
     NAME:- DHARMENDRA PRAJAPATI
     ID:- 20IT117
*/

package JavaProgramming2021;
import java.util.Scanner;

public class Primality_Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        for(int i=0;i<N;i++){
            long num = scan.nextLong();
            int cnt = 0;
            for(int j=2;j<num/2;j++){
                if(num%j == 0){
                    System.out.println("no");
                    cnt = 1;
                    break;
                }
            }

            if(num == 1){
                System.out.println("no");
            }
            if(cnt ==0 && num != 1){
                System.out.println("yes");
            }
        }
    }
}


/*
while(i<num){
if(num%i == 0){
cnt = 1;
break;
}
i++
}

if(cnt == 1){
System.out.println("no");
}
else{
System.out.println("yes");
}
*/
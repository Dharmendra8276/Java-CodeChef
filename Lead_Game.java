/*
   Name:- PRAJAPATI DHARMENDRA
   ID:- 20IT117
*/
/*
package JavaProgramming2021;

import java.util.Scanner;

public class Lead_Game {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int []lead = new int[N];
        if(N >= 2 && N <= 10000)
        {
            for (int i = 0; i < N; i++)
            {
                int player1 = input.nextInt();
                int player2 = input.nextInt();
                if((player1 >= 1 && player1 <=1000) && (player2 >= 1 && player2 <=1000))
                {
                    if (player1 < player2)
                    {
                        int temp = player2;
                        player2 = player1;
                        player1 = temp;
                    }
                    lead[i] = player1 - player2;
                }
            }

            for (int j = 0; j < N; j++)
            {
                int count = 0;
                for (int k = 0; k < N; k++)
                {
                    if (lead[j] > lead[k])
                    {
                        count++;
                    }
                }
                if (count == (N - 1))
                {
                    System.out.println(j + 1 + " " + lead[j]);
                    break;
                }
            }
        }
    }
}*/


package JavaProgramming2021;

        import java.util.Scanner;

public class Lead_Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int []lead = new int[N];
        for(int i=0;i<N;i++){

            int player1 = scan.nextInt();
            int player2 = scan.nextInt();

            int result;
            if(player1 > player2){
                lead[i] = player1 - player2;
                System.out.println(i+1+" "+lead[i]);
            }
            else{
                lead[i] = player2 - player1;
            }
        }

    }
}
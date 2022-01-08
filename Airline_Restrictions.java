package JavaProgramming2021;

import java.util.Scanner;

public class Airline_Restrictions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            int E = sc.nextInt();

            int add1 = A+B;
            int add2 = A+C;
            int add3 = B+C;

            if(A>E && B>E && C>E){
                System.out.println("NO");
            }
            else if(add1<=D && C<=E){
                System.out.println("YES");
            }
            else if(add2<=D && B<=E){
                System.out.println("YES");
            }
            else if(add3<=D && A<=E){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

//            int add = A+C;
//
//            if(A>E && B>E && C>E){
//                System.out.println("NO");
//            }
//            else if(add<=D && (A<E || B<E || C<E)){
//                System.out.println("YES");
//            }
//            else if(add>D){
//                System.out.println("NO");
//            }
//            else{
//                System.out.println("YES");
//            }
        }
    }
}

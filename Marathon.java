package JavaProgramming2021;

import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        if(T>=1 && T<=50){    //Condition given in problem
            while(T-- > 0){
                int D = sc.nextInt();
                if(D>=1 && D<=10){   //Condition given in problem
                    int d = sc.nextInt();
                    if(d>=1 && d<=5){    //Condition given in problem
                        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
                        if(A<B && B<C){      //Condition given in problem
                            int mul = D*d;
                            if(mul>=10 && mul<21){
                                System.out.println(A);
                            }
                            else if(mul>=21 && mul<42){
                                System.out.println(B);
                            }
                            else if(mul>=42){
                                System.out.println(C);
                            }
                            else{
                                System.out.println("0");
                            }
                        }
                    }
                }
            }
        }
        sc.close();
    }
}

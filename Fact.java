import javax.lang.model.util.ElementScanner6;

//========== Factorial ===================

/* Factorial is a product of all +ve(non-negetive) integers from 1 to n
DENOTED as n!

5! = 1*2*3*4*5 = 120
10! = 1*2*3*4*5*6*7*8*9*10 =36,28,800
0! = 1
=========== Pseudo code ==========

fact(n)
    if n equal 0  // Base Condition
        return 1
    else 
        return(n*fact(n-1))

========= Working ===========

1. Value pass into func
2. Let value i > 0 where i = 4
3. Else Condition Run
4. 4*fact(4-1) = 4*fact(3)
   4*3*fact(2)
   4*3*2*fact(1)
   4*3*2*1*fact(0)
   4*3*2*1=24 */

import java.util.Scanner; 
public class Fact {
   public static int fact(int n) 
   {
       if( n==0)
       {
           return 1;
       }

       else
       {
           return(n*fact(n-1));
       }
   }
   public static void main(String[] args)
   {
        int n1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Value: ");
        n1 =scan.nextInt();
        System.out.println(fact(n1));
   }
}

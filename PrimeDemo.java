
package primedemo;

import java.util.Scanner;


public class PrimeDemo {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int m,n,count=0,totalprime=0;
       int i,j;
       System.out.println("enter initial number");
       m=input.nextInt();
       System.out.println("enter final number");
       n=input.nextInt();
       for(i=m;i<=n;i++){
           for(j=2;j<=i-1;j++){
               if(i%j==0){
                   count++;
                   break;
               }
           }
           if(count==0){
               System.out.println(i);
               totalprime++;
           }
           count=0;
       }
       System.out.println("totalprime "+totalprime);
    }
    }
    


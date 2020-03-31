
package fibodemo;

import java.util.Scanner;


public class FiboDemo {

  
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n,fibo,i;
    int first=0;
    int second=1;
    System.out.println("how many numbers");
    n=input.nextInt();
    System.out.println(first+""+second);
    for(i=3;i<=n;i++){
        fibo=first+second;
        System.out.println(" "+fibo);
        first = second;
        second = fibo;
    }
    System.out.println();
    }
    
}

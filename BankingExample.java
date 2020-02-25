
package bankingexample;

import java.util.*;

class Account{
    private int balance;
    private int password;    
    public void withdraw(int pw,int amount){
        
        if(pw==password){
          balance-=amount; 
          System.out.println("Your updated balance is : "+balance);
        }
        else
            System.out.println("Please Enter a valid password ");
        
        
    }
    public void deposit(int amount){
        balance+=amount;
        System.out.println("Your updated balance is : "+balance);
    }
    public void setPassword(int p){
     password=p;
    }
    public void checkBalance(){
        
        System.out.println("Enter your Password: ");
        Scanner scanner = new Scanner(System.in);
        int pw = scanner.nextInt(); 
        
        
        if(pw==password){
          System.out.println("Your account balance is : "+balance);
        }
        else
            System.out.println("Please Enter a valid password ");
    }
}


public class BankingExample {

    
    public static void main(String[] args) {
        Account A=new Account();
        A.setPassword(12345);
        A.checkBalance();
        A.deposit(500);
        A.checkBalance();
        A.checkBalance();
        A.withdraw(12345, 100);
        A.withdraw(1234,200);
    }
    
}

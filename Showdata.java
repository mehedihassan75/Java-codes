
package showdata;


class A_Class{
    private int p;
    
    private void setP(int x){
        p=x;        
    }
    public void showP(int x){
        setP(x);
        System.out.println("The Value of P is : "+p);
    }    
}


class Dog{
    int age;
    void bark(String s){
         System.out.println(s);
    
}

}
public class Showdata {

    
    public static void main(String[] args) {
    
        
    A_Class a_obj=new A_Class();
  
    
    a_obj.showP(12);
    
    

        
    }
    
}

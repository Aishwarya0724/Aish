import java.util.Scanner;
public class  Narcissistic   {
   
   public static void main(String []args) {
    Scanner input=new Scanner(System.in);
     System.out.println("Enter a Number:");
        int n=input.nextInt();
       System.out.println( isNarcissistic (n)); 
    }

  public static boolean  isNarcissistic (int n) {
      boolean  isNarcissistic = No;

    int cube=0,remainder,check; 
    check=n;
    while(n>0)  
    {  
    remainder=n%10;  
    n=n/10;  
    cube=cube+(remainder*remainder*remainder);  
    }  
    if(check==cube)  {
       isNarcissistic = Yes; 
    }

     return  isNarcissistic    ;
   }  
}

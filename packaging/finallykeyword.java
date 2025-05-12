package packaging;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.management.RuntimeErrorException;

public class finallykeyword {
    
//finally block executes even whether the exception is thrown or not
//we neeed to free up memory space for physical resources that we have initliazed
//because garbase collector helps us to free up memory space for those object which are not in use.

public static void main(String args[]) 
{
   
   
   int ans=helloworld(2 ,1);
   System.out.println(ans);
}





public static int helloworld(int x,int y)
{
   try{
   int ans=x/y;
   throw new ArithmeticException();
   }
   catch(Exception e)
   {
        throw new RuntimeException();
   }
   finally{
    System.out.println(" this will run whether exception is thrown or not");
   }
}
}

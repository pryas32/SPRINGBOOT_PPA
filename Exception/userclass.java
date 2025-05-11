package Exception;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class userclass {

public static void main(String args[]) throws IOException
{
   try{
    calculation();
   }
   catch(Exception e)
   {
   //throw e;//here e is of IOException hence will not create problem
  throw new IOException();   
}
}

public static void calculation() throws IOException,FileNotFoundException
{
    try{
        FileReader file=new FileReader("C:\\Users\\LENOVO\\OneDrive\\Desktop\\dsu.txt");
    }
    catch(Exception e)
    {
        throw new IOException();
    }
}


// we should handle the exception as late as possible we should always try to pass an exception.

//in case of mismatch of exception exception get passed of callee.
// we can decalre multiple exception within one block








    
}

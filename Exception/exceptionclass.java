package Exception;

import java.io.FileReader;
import java.io.IOException;

public class exceptionclass {


public static void main(String args[])throws IOException{

    readingFile();
}



public static void readingFile() throws IOException
{
    FileReader f=null;
    try{

    f=new FileReader("C:\\Users\\LENOVO\\OneDrive\\Desktop\\token.txt");

  
    }
    catch(Exception e)
    {
    throw new RuntimeException(e);//wrapping up exception to unchecked exception as they are unchecked one so need not to through exception.
    }
f.close();
System.out.println("Hello world");

//Exception->it tells the abnormal flow of the computer program



}




    
}

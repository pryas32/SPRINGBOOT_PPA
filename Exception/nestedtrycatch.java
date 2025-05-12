package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.IIOException;



public class nestedtrycatch {

public static void main(String args[]) throws Exception
{
    //problem with finally block 

//they supress the actual cause of exception
//eg


filereading();



}


public static void filereading() throws IOException
{
    FileReader f=null;

 try{
    f=new FileReader("C:\\Users\\LENOVO\\OneDrive\\Documents\\helloworld.txt");
 }
 catch(Exception e)
 {
    throw e;
 }
finally{
    throw new IOException();
}





}


}
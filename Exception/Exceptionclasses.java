package Exception;

import java.io.FileNotFoundException;

import javax.management.RuntimeErrorException;

public class Exceptionclasses {
//why excepotion is important

//because if we have usedd error code then it would have create a lot of issue and also we need to put out mind in logic alos if else property would have create a mess up 
//so that why we prefered exception 
public static void main(String args[])
{
    readinput();
}

public static void readinput()
{
    readexception();
}

public static void readexception()
{
    try{
 readfile();
    }
    catch(Exception e){
       // throw new RuntimeException(e.getMessage()+"additional meesga");
    
    throw new RuntimeException("additional message", e);

    }
   
}

public static void readfile() throws FileNotFoundException
{
    readhandler();
}

    

public static void readhandler() throws FileNotFoundException
{
    throw new FileNotFoundException("the file has not been found");
}

}
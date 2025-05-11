package Exception;

import javax.management.InvalidAttributeValueException;

public class Esceptionclasses {
    
public static void main(String args[]) throws InvalidAttributeValueException
{
//Throwable is the root of all the exception
// under throwable 
// there is error and Runtime excpetion which are unchecked exception under runtime exception we can get like NULLpointer exception,Indexoutofbound exception
// we need not to through them we need to handle them using checked exception eg 
// checked exception like FILENOTFOUNDEXCEPTION,ENDOFFILEEXCEPTION,(()INVALIDATTRIBUITEEXCEPTION)
//we need to handle uncheked exception using checked exception.
String str=null;
conversion(str);




}



public static void conversion(String str) throws InvalidAttributeValueException
{

if(str==null)
{
    throw new InvalidAttributeValueException(" used null pointer");
}

    str.toUpperCase();
}













}

package Exception.Reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class test {

public static void main(String args[])
{

Datamanager d=new Datamanager();

Class c=d.getClass();

Field[] f=c.getDeclaredFields();

for(Field f1: f)
System.out.println(f1.getName());



Method [] m=c.getDeclaredMethods();
for(Method m1:m)
{
    System.out.println(m1.getName());
}


}




when we compile the java code it get converted into bytes on doind run this bytecode jvm start loading these start loading all the blueprint of the class.







    
}

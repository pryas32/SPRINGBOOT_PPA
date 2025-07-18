public class staticvariables {

//static property are at they class level 
//its common for all the object
int x1;

private static int x=0;

private static void printstatickeyword()
{
     System.out.println(x);
}

staticvariables()
{
    x++;
}//static keyword doesnt have an access to this keyword as they are loaded during compilation time
//we cant access non static method /variables as static prioperty get loaded during compilation time inside staric method.

public static void main(String args[])
{
    staticvariables s=new staticvariables();
    staticvariables s2=new staticvariables();


    staticvariables.printstatickeyword();
}




    
}

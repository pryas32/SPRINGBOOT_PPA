package packaging;

public class statickeywordtest {

public static void main(String args[])
{
    statikeyword s=new statikeyword();
    statikeyword s1=new statikeyword();
    //static properties are at class level they are loaded during class loading so we can access static properties either by class name or by object naem no pblm 
    //while we cant access nion static object inside static method because they are not initialized 
    //during class loading time but vice versa is not possible
    System.out.print(statikeyword.count);
  
    System.out.println(s.count);

}


    
}

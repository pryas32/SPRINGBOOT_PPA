package composition;

public class composition {

    //why prefer composition over inheritance

//composition helps us to debug code more easily than in comparison to inhertiance as in inhertiance we need to go upto 
//parent or object level for debugging purpose
//compostion->it is defined as a class which is composed of some other class.

//eg dbmanager is a class which has method to connect to database so out compostion class has dependency on dbmanager for access databse info.

private final dbmannager dbmannager;

composition(dbmannager dbmannager)
{
    this.dbmannager=dbmannager;
}







public void foo()
{
     System.out.println("hello world");
       
}









    
}

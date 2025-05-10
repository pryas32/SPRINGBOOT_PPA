package packaging;

public class inhertiancetest {
    
    public static void main(String args[])
    {
        inheritance i=new childlish(0, null, 0);//as paremnt is pointing to child samermethod which has significance in them too so no error
        i.abc();//this cant do as that method not decalred in parent

//we can o like this also ;
Object o=new childlish(0, null, 0);//we can point from object also 
System.out.println(o.getClass());
System.out.println("hello-------------------------");
inheritance-> wec use when we want parent all field and method to be used inside the child.


    }









}

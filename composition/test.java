package composition;

public class test {

    public static void main(String args[])
    {
     dbmannager db=new dbmannager(23);
    composition c=new composition(db);
    
   c.foo();

db.setx(34);
c.foo();

    }
}

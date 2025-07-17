package Exception.Reflection;

public class tester {




 public static void main(String args[])
 { 

Sciencemarks sc = new Sciencemarks(12, 2, 12.0);
serialization sc1 = new serialization(1, sc, 12.34);
System.out.println(new serializer().serialize(sc1));


 
 }


}
 
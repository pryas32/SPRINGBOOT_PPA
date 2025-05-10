package packaging;

public class Tester {
    public static void main(String args[]) {

hello h=new hello(0, null);



      
        System.out.println(h.age);
        System.out.println(h.name);


   h = new hello(1, "pryas");
System.out.println(h.age);
        System.out.println(h.name); 



   AccessModifier a=new AccessModifier();
   a.setage(-23);

System.out.println(a.getage());
//we can ensure data integrity only during runtime as on runtime only object creation takes place

protected modifier ->it means some classes can access fields while other cannot .



//default connstructor/no-args connstructor->it doesnt takes any argument and initial fiedld with default value .



    }
}

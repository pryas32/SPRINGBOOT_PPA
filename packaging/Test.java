package packaging;

public class Test {

public static void main(String args[]){

Person p=new Person(23,"Prayas",new Biodata("BTech"));                
System.out.println(p.age+" "+p.name+" "+p.biodata);
    
System.out.print("-----------------------------------");
p.setBiodata("BCA");

System.out.println(p.biodata);




}


}
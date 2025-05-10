package packaging;

public class Test {

public static void main(String args[]){

child c=new child();//both interface and abstract helps in polymorphism ,polymorphism mean having many forms helps in making generic code which can be used by everyone.
interfacing abc=new child();//means at runtime it will see which method is the prent pointing to if caling child other method then will give error
//like this 


//abc.sound(); //herte it will give error as parent doesnt have that founction 

//we can only typecast parent to child

abc=null;

abc=new child();

c=((child)abc);
c.sound();



System.out.println("___________________________________________");
// we cant create instance of parent class;


//ie interfacing f=new interfacing();//cant do as parent doesnt have that method implemtn in it.


abc.abc();
c.abc();



// Person p=new Person(23,"Prayas",new Biodata("BTech"));                
// System.out.println(p.age+" "+p.name+" "+p.biodata);
    
// System.out.print("-----------------------------------");
// p.setBiodata("BCA");

// System.out.println(p.biodata);




}


}
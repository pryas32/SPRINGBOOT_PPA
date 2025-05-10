package packaging;

public class finaltester {

public static void main(String args[])
{
    final finalkeyword f=new finalkeyword(23,"ge");//as refrence is made final so we wont be able to make it to point some other location.
//but we can set it age etc other field in it as if they are not final.
    //f=new finalkeyword(34, "Aayush");

f.setage(34);

    System.out.println(f.age);


}



    
}

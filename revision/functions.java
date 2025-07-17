class point{
    int x;
    int y;
}

public class functions {
    
//whetever we define here that act as  a global variable
public static void main(String args[])// this is main fucntion which is called first 
{
   
    int x=2;

    func(2);//primitive type they are not passed as a references while non primnitive type they are passed as a reference

point p=new point();
p.x=34;

printfunction(p);


System.out.println(p.x+" "+p.y);



System.out.println(x);

}


public static void func(int a)
{

    a++;
    //System.out.println("Hello world");
}




public static void printfunction(point p)
{
    p=new point();
       p.x=11;
       p.y=23;
}



}

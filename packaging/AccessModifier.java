package packaging;

public class AccessModifier {

//it is used to ensure the data intrgrity.manipultes the illegal change of the data field

//encapsulation->data hiding and only exposing them using the getter and setters

int age;
String name;


public int getage(){
    return age;
}

void setage(int age){
if(age<0)
{
    throw new RuntimeException("You entered negative value");
}
 this.age=age;

}















    
}

public class thiskeyword {
int x;
int y;




thiskeyword(int x,int y)
{
   this.x=x;
   this.y=y;
}

thiskeyword()
{
    this(2, 4);
}



thiskeyword setX(int x)
{
    this.x=x;
    return this;
}

thiskeyword setY(int y)
{
    this.y=y;
    return this;
}


public void print()
{
    System.out.println(x+" "+y);
}



//this keyword helps inchaining of the functions

//this helps to call the constructor calling


// this->it refers to the current object for which the code need to be executed





    
}

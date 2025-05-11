package packaging;

import java.util.List;

public class oopschild extends oops{

public void print()
{
    super.print();
    List<Integer>arr=super.nums;

for(Integer i: arr)
{
    if(i%2==0)
    {
        System.out.println(i);
    }
}


}


    
}

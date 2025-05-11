package packaging;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class oops {
    int x;
    int y;


       oops(int x,int y)
       {
   this.x=x;
   this.y=y;

       }



List<Integer>nums;

void print()
{
    nums=new ArrayList<>();
    for(int i=1;i<1000;i++)
    {
        Random r=new Random();
        nums.add(r.nextInt(i));
    }
}

}

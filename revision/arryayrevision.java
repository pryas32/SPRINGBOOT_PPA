import java.util.*;

class Point{
    int x;
    int y;

    Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }


}








class arryayrevision{
    
public static void main(String args[])
{


    // Scanner sc=new Scanner(System.in);
//     int arr[]=new int[3];

//    int arr1[]={1,2,3};


//    System.out.println(arr.length);
//    System.out.println(arr1.length);


//    int [] a,b;// here we defind on stack but didnt gace refrence

//    a=new int[4];
//    b=new int[5];


//    System.out.println(a.length);
//    System.out.println(b.length);



   //for two dimensional array

//   int arr45[][]=new int[1][2];
//    for(int i=0;i<arr45.length;i++)
//    {
//     for(int j=0;j<arr45[i].length;j++)
//     {
//        int n=sc.nextInt();
// arr45[i][j]=n;
// }
//    }




// for(int i=0;i<arr45.length;i++)
//    {
//     for(int j=0;j<arr45[i].length;j++)
//     {
//          System.out.println(arr45[i][j]);
// }
//    }




Point p[]={
   new Point(2,3),new Point(4,5)
};


for(Point i:p)
{
    System.out.println(i.x+" "+i.y);
}


//here point p[] is a reference so its not contigous iin nature




}



}
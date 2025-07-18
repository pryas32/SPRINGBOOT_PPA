public class stringing{
    public static void main(String args[])
    {
  char  ch[]={'a','b'};

    for(int i=0;i<ch.length;i++)
    {
        System.out.println(ch[i]);
    }   

//     String is thread safe in java

// its immutable

// whenever we do concatenation in java then we get creation of new memmory location hence string are immutble in java


String abc="Pryas";
System.out.println(abc.length());

String s="ab";
String s2="ab";

if(s.contains(s2))
{
    System.out.print(true);
}
else{
    System.out.print(false);
}
if(s.equals(s2))
{
    System.out.print(true);
}
else{
    System.out.print(false);
}

int res=s.compareTo(s2);


    if(res>0)
    {
System.out.println("a is greater than  b");
    }
    else if(res==0)
    {
       System.out.print("equals");
    }
    else{
        System.out.println("b is greater than a");
    }
   StringBuffer str=new StringBuffer("abc");

StringBuffer str2=new StringBuffer("def");


str.append(str2);
System.out.println(s2);

str.setCharAt(2, 'c');

System.out.println(str);
str.deleteCharAt(2);
System.out.println(str);

str.replace(1,3, "ax");










    }
}
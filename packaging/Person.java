package packaging;

public class Person {

final int age;

final String name;

 private Biodata biodata;


Person(int age,String name,Biodata biodatafield)
{
      this.age=age;
      this.name=name;
      this.biodata=biodatafield;
}

   //we make the object as immutable which is shared among thread so that it cant be chnaged by multiple thread 
   //at the same time leading to race condition.





  }



    
}

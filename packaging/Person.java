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

    public void setBiodata(Biodata biodata)
    {
       this.biodata=new Biodata(biodata);
    }
 
  }



    
}

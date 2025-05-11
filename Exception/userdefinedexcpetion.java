package Exception;

public class userdefinedexcpetion extends Exception{

  

userdefinedexcpetion()
{
 super();
}

userdefinedexcpetion(String message)
{
    super(message);
    

}

userdefinedexcpetion(Throwable e)
{
    super(e);
}


userdefinedexcpetion(Throwable e,String messagge)
{
    super(messagge,e);
}


    
}

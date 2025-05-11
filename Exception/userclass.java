package Exception;

import java.io.FileReader;

public class userclass {

public static void main(String args[])throws userdefinedexcpetion
{
    calculation();
}

public static void calculation() throws userdefinedexcpetion
{
    try{
        FileReader file=new FileReader("C:\\Users\\LENOVO\\OneDrive\\Desktop\\dsu.txt");
    }
    catch(Exception e)
    {
        throw new userdefinedexcpetion("message"+e);
    }
}










    
}

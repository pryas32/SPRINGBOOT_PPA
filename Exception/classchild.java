package Exception;

import java.io.IOException;

public class classchild implements exceptioning {

    @Override
    public void except()// here we should not chnage the except defintion hence we cant through exception from here
    {
        try{
  start();
        }
        catch(Exception e)
        {
           e.printStackTrace();
            //wrap it into unchecked exception.
        }

      
    }

public void start() throws IOException{
    throw new IOException();
}




    
}

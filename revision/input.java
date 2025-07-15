import java.io.BufferedReader; // This was missing!
import java.io.InputStreamReader;
import java.io.IOException;

public class input {
    

public static void main(String[] args) throws IOException {
        // Create BufferedReader to read input from standard input (keyboard)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read a line of text
        String s = br.readLine();
        
        int x=Integer.parseInt(s);
        // Print the input
        System.out.println(x);
    }


}

// BufferedReader is much faster than scanner its used in multithreaded env
// it throws checked exception
// IOException


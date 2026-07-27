package exception;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample {
    public static void main(String[] args){      
        try(FileReader fr =new FileReader("mmm.txt");
            
    ){
           int x=10;
            int y=0;
            int z=x/y;
            
           //file hnadling jobs
           fr.close();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("nummber exception");
        }
    }

}

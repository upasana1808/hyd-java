package exception;

import java.io.FileReader;

public class CompileTimeException {
    public static void main(String[] args){
        try{
            int x=10;
            int y=0;
            int z=x/y;
           FileReader fr=new FileReader("myfile.txt");
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("nummber exception");
        }
    }

}

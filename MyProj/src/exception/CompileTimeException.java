package exception;

import java.io.FileReader;
import java.io.IOException;

public class CompileTimeException {
    public static void main(String[] args){
        FileReader fr=null;
        try {
           int x=10;
            int y=0;
            int z=x/y;
            fr=new FileReader("myfile.txt");
           //file hnadling jobs
           fr.close();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("nummber exception");
        }finally{
            try {
                fr.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("I will get executed not matter what");
        }
    }

}

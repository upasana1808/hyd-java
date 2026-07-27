package exception;

import java.io.FileReader;

public class SampleHandle {
    //handling
    public void method1(){
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
    //declare
    public void method2() throws Exception{
         int x=10;
        int y=0;
        int z=x/y;
    }

}

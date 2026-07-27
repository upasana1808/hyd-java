package exception;

public class Sample {
    public static void main(String[] args) {//runtime exception unchecked
        try{
            int x=10;
            int y=2;
            int z=x/y;
            System.out.println("Phase 1");
            int[] num=new int[5];
            num[5]=100;
            System.out.println("Phase 2");
        }catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
            System.out.println("nummber exception");
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
            System.out.println("array exception");
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("general exception");
        }
        
        
    }

}

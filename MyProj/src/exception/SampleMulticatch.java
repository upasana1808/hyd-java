package exception;

public class SampleMulticatch {
    public static void main(String[] args) {//runtime exception unchecked
        try{
            int x=10;
            int y=2;
            int z=x/y;
            System.out.println("Phase 1");
            int[] num=new int[5];
            num[5]=100;
            System.out.println("Phase 2");
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e)
        {
            System.out.println(e.getMessage());
            if(e instanceof ArithmeticException )
                System.out.println("Number error");
            else  if(e instanceof ArrayIndexOutOfBoundsException )
                System.out.println("array error");
            else if(e instanceof NullPointerException )
                System.out.println("null errro ");
            else
                System.out.println("general exception");
           
        }
        
    }

}

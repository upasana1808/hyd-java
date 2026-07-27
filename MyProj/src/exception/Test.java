package exception;

public class Test {
    public static void main(String[] args) {
        SampleHandle obj=new SampleHandle();
        obj.method1();
        try {
            obj.method2();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

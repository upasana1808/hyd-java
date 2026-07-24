package OOPS.lambda;

public class Test {
    public static void main(String[] args) {
        Greeting g=new Greeting(){            
        @Override
            public void greet() {
            System.out.println("hello");
        }
        };
        g.greet();
    
        Greeting g1=()->{System.out.println("hello");};
        g1.greet();
        Greeting1 g11=(n)->{System.out.println("hello");};
        g11.greet1("upasana");

        Greeting2 g22=(n,m)->{return "hello "+n+" "+m;};
        g22.greet1("uppu","dev");
      
        Notable n=new Notable(){
            public void note(){}
            public void write(){}
        };

    ///lambda Expression 
    /// left side=> rightside
    /// arguments-> body
    /// ()->{}
        // Person p=new Person();
        // p.greet();
        //Greeting g=new Greeting();
        //Greeting g=new Person();
        //anonymous class
        
    }

}

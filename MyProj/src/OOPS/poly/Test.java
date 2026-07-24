package OOPS.poly;

public class Test {
    public static void main(String[] args) {
        Liquid l1=new Liquid();
        Tea t=new Tea();
        Coffee c=new Coffee();
        Milk m=new Milk();
        Mug mm=new Mug();
        Juice j=new Juice();
        mm.addLiquid(l1);
        mm.addLiquid(t);
        mm.addLiquid(c);
        mm.addLiquid(m);
        //mm.addLiquid(j);
    }
    
}

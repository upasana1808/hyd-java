package OOPS.strings;

public class StringExample {
    public static void main(String[] args) {
        String name="Upasana";//obj1
        name="hello "+name;//obj2
        name=name+ " Hello how are you?";//obj3

        StringBuilder sb=new StringBuilder();
        sb.append("Upasana");
        sb.append("Hello ");
        sb.insert(1, "hello");

        System.out.println(sb);
        sb.reverse();
        
    }

}

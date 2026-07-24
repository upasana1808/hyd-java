package OOPS.encapsulation;
//pacaking data with code
public class Person {
    //data
    private String name;
    private int age;
    private String address;
    public String email;
    int networth;  //default
    protected String familyName;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age<=0)
            System.out.println("invalid age");
        else
            this.age=age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    //code
    
    
}

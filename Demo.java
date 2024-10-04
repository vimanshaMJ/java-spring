class Human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    

} // private variables - accessable only in this class. Only way to access is with the help of methods

public class Demo{
    public static void main(String a[]){

        Human obj = new Human(); 
        obj.setAge(23);
        obj.setName("Vimansha");

        System.out.println("Name: "+obj.getName());
        System.out.println("Age: "+obj.getAge());
    }
}
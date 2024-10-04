class Mobile {
    String brand;
    int price;
    static String name; // static variable

    public Mobile() {
        brand = "Samsung";
        price = 200;
        System.out.println("In constructor");
    } // constructor

    static {
        name = "Phone";
        System.out.println("In static block");
    } // static block

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class Demo {
    public static void main(String a[]) {
        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 500;
        // Mobile.name = "Smart phone";

        // Mobile obj2 = new Mobile();
        // if we dont create an object, static block and constructor will not be executed
    }
}

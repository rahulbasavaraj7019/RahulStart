

class A{
    public void m1(){
        System.out.println("A-m1 method");
    }
}
class B extends A{
    public void m1(){
        System.out.println("B-m1 method");
    }
    public void m2(){
        System.out.println("B-m2 method ");
    }
}

public class Test {
    public static void main(String[] args) {
        B obj=new B();
        obj.m1();
        A obj1=new A();
        obj1.m1();
        A obj2=new B();
        obj2.m1();
        obj.m2();

    }
    
}

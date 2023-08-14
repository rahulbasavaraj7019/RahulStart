

 class Parent {
    public void s(){
        System.out.println("P classs()method");
    }
    public void b(){
        System.out.println("Parent class B()method");
    }
}
class Child extends Parent{
    public void R(){
        System.out.println("child class R() method");
    }
}
public class Test{
    public static void main(String[] args) {
        Parent obj1=new Parent();
        Parent obj2=new Child();
        Child obj3=new Child();
        obj2.s();
        obj2.b();
        obj2.R();// THis cannot work as we have given parent reference
        obj1.s();




    }
}

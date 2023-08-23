abstract class absexam {
    public abstract void m2();
    public void m1(){
        System.out.println("HEyy");
    }
    
}
class Ba extends absexam{
    public void m2(){
        System.out.println("child reference");
    }

}
class Test{
    public static void main(String[] args) {
       Ba obj1=new Ba();
       obj1.m1();
       obj1.m2();
    }
}


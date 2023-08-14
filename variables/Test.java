class Test{
    int a =20;
    static int b=30;
    public static void main(String[] args){
        int c =20;
       Test obj1=new Test();
            Test obj2=new Test();
             System.out.println(obj1.b) ;
              System.out.println(Test.b);
               System.out.println(b);
              obj1.a=200;
              b=300;
           System.out.println(obj2.b) ;
          System.out.println(obj2.a);
           System.out.println(obj1.a);
                 }
}
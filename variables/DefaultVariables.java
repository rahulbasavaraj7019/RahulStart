class DefaultVariables{
    int a =20;
    static int b=30;
    public static void main(String[] args){
        int c =20;
        DefaultVariables obj1=new DefaultVariables();
             DefaultVariables obj2=new DefaultVariables();
             System.out.println(obj1.b) ;
              System.out.println(obj2.b);
               System.out.println(obj1.a);
               obj2.a=200;
               obj2.b=300;
                System.out.println(obj2.b) ;
              System.out.println(obj2.a);
               System.out.println(obj1.a);
                 }
}
class Emp{
    int eid;
    String ename;
    double esal;
    static String eorg_name="TCS";

   public static void main(String[] args){
        Emp e1=new Emp();
        Emp e2=new Emp();
        Emp e3=new Emp();


        e1.eid=101;
        e1.ename="Rahul";
        e1.esal=45000.00;


        e2.eid=102;
        e2.ename="Priyanka";
        e2.esal=55000.00;

        e3.eid=103;
        e3.ename="Sonia";
        e3.esal=65000.00;
        
        System.out.println(e1.ename);
        System.out.println(e1.eid);
        System.out.println(e1.esal);
        System.out.println(e1.eorg_name);

    }


}
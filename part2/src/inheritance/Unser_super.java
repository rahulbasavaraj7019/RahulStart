package inheritance;

class Account{
    int branch_Id = 256;
    Account(){
         System.out.println("Account Class Constr");
    }
    public void get_Account(){
        System.out.println("Account Class Details");
    }
}

class Unser_super extends Account{
    int branch_Id = 455;
    Unser_super(){
        super(); // invoking parent class const
        super.get_Account(); //invoking parent method
        this.branch_Id =super.branch_Id; // geting parent var
    }
    public void get_Account(){
        System.out.println("SA Class Details");
    }
    public static void main(String[] args) {
            Unser_super a1=new Unser_super();
            System.out.println(a1.branch_Id);
           
           
    }
}
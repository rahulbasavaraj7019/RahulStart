interface Account{
    int min_Bal=500;
    void open_Account();

}
class AccountImpl implements Account{
    int Bal=50000;//we can't use extra code other than implementation
    public void open_Account(){
        System.out.println("Account opened Successfully");
    }
    
}

public class Test {
    public static void main(String[] args) {
         Account ref=new AccountImpl();
         ref.open_Account();
         System.out.println(AccountImpl.min_Bal);
         System.out.println(AccountImpl.Bal);//we can't use extra code other than implementation

    }
    
}

interface DaoInterf{
    void login();
    void logout();
}
 class DaoImpl implements DaoInterf{
    public void login(){
        System.out.println("Login method");
    }
    public void logout(){
        System.out.println("Logout method");
    }
}

public class Dao {
    public static void main(String[] args) {
        DaoImpl obj=new DaoImpl();
        obj.login();
        obj.logout();
    }
    
}

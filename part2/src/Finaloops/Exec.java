package Finaloops;

public class Exec {
	public static void main(String[] args) {
		SA a1=new SA();
		a1.setAcc_Id(111);
		a1.setAcc_name("Rahul");
		a1.setAcc_amount(2000.00);
		a1.setMin_bal(22.00);
		//a1.cal_bal();
		AccountService.acc_details(a1);
		
		CA a2=new CA();
		a2.setAcc_Id(112);
		a2.setAcc_name("Mohan");
		a2.setAcc_amount(40000.00);
		a2.setMin_bal(1000);
		//a2.cal_bal();
		AccountService.acc_details(a2);
		
		
	}

}

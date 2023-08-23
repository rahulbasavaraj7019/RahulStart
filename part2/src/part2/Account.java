package part2;

public class Account {
	private double sal;
	private String acc_name;
	
	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getAcc_name() {
		return acc_name;
	}

	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}

	public static void main(String[] args) {
		Account a1=new Account();
		a1.setSal(20000);
		a1.setAcc_name("Rahul");
		System.out.println(a1.getSal());
		System.out.println(a1.getAcc_name());
		
		
		
		// TODO Auto-generated method stub

	}

}

package Finaloops;

public class CA extends Account {
	private double min_bal;

	public double getMin_bal() {
		return min_bal;
	}

	public void setMin_bal(double min_bal) {
		this.min_bal = min_bal;
	}
	public void cal_bal() {
		double bal=this.getAcc_amount();
		bal=bal-this.getMin_bal();
		System.out.println(bal);
		}
	

}

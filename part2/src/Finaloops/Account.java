package Finaloops;

public class Account extends Bank {
	private int acc_Id;
	private String acc_name;
	private double acc_amount;
	public int getAcc_Id() {
		return acc_Id;
	}
	public void setAcc_Id(int acc_Id) {
		this.acc_Id = acc_Id;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	public double getAcc_amount() {
		return acc_amount;
	}
	public void setAcc_amount(double acc_amount) {
		this.acc_amount = acc_amount;
	}
	public void cal_bal() {}
	

}

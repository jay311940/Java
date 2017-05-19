package Ex6Classes;

public class Ex6Gym {

	private int membershipNumber;
	private double cost;
	private int paymentFrequency;


	public static final int PAY_AS_YOU_GO = 9;
	public static final int MONTHLY = 35;
	public static final int YEARLY = 350;

	public static int membershipCounter = 100;

	public int Gym() {

		membershipNumber = membershipCounter++;
		return membershipNumber;

	}

	public Ex6Gym(String name, int paymentFrequency) {
		this();
		this.name= name;
		this.paymentFrequency;
	}

	public void setName(String name) {
		
		return name;

	}

	public void setPaymentFrequency() {
		
		
	}

	public int getPaymentFrequency() {
		
		return paymentFrequency;

	}

	public int getMebershipNumber() {
		return membershipNumber;
	}

	public double calculateCost() {
		if (paymentFrequency == PAY_AS_YOU_GO)
			cost = 9;
		else if ( paymentFrequency == YEARLY)
			cost = 350;
		else cost = YEARLY / 12 * 1.2;
		return cost;

	}




}

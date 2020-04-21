
// a program calculate a car payment
public class CarLoan {
	public static void main(String[] args) {
		
	int carLoan = 10000;
	//this will represent a loan length of 3 years
	int loanLength = 3;
	//an interest rate of 5% on the loan
	int interestRate = 5;
	//the down payment provided by a user for this purchase
	int downPayment = 2000;
	
	if(loanLength<=0 || interestRate <= 0) {
		System.out.println("Error! You must take out a valid car loan");
	}
	 else if(downPayment >= carLoan) {
		System.out.println("The car can be paid in full.");
	} else {
		int remainingBalance = carLoan - downPayment;
		//convert the loan length from years to month
		int months = loanLength *12;
		//the monthly payment without interested included
		int monthlyBalance = remainingBalance / months;
		//the user needs to pay interest on the loan borrowed
		int interest = monthlyBalance * interestRate / 100;
		//calculate the final monthly payment
		int monthlyPayment = monthlyBalance+interest;
		//print out the monthly payment
		System.out.println(monthlyPayment);
		
	}
  }
}

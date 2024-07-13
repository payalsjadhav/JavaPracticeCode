//Method Overriding

package Oops;


class RBIBnk{
	
	boolean checkEligibility() {
		return true;
	}
	double homeLoanRofi() {
		return 10.85;
	}
	
	double personalLoanRofi() {
		return 13.35;
	}
}
public class SBIBank extends RBIBnk{
	
	public String applyHomeLoan() {
		
		boolean status = checkEligibility();
		if(status) {
			double homeloanRofi = gethomeLoanRofi();
			String msg = "You are loan approved with RI as :: "+homeloanRofi;
			return msg;
			
		}else {
			return "You are not Eligible for loan";
		}
	}

	double gethomeLoanRofi() {
		return 12.56;
	}

	public static void main(String[] args) {

		SBIBank sb = new SBIBank();
		
		String msg = sb.applyHomeLoan();
		
		System.out.println(msg);
	}

}

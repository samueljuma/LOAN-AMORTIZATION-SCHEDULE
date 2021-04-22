package loan_repayment;
public class LoanRepayment {
    static Object[][] data;
    public static void Calculations(double loanAmount, double interestRate, double loanPeriod) {
        double paymentAmount, paymentPrint, principalAmount, principalPrint;
        double interest, interestPrint, loanOutstandingBalance, balancePrint;
        //Calculations
        int totalNumberOfPayments = (int) loanPeriod; int count = 0;
        data = new Object[totalNumberOfPayments][5];
        do {
            //  payment amount
            data[count][0] = count + 1; // stores value
            paymentAmount = ((interestRate*loanAmount)/(1-(Math.pow((1+interestRate),(-(loanPeriod))))));
            paymentPrint = Math.round(paymentAmount * 100.0) / 100.0;
            data[count][1] = paymentPrint; // stores value
            // principal amount
            principalAmount = paymentAmount*(Math.pow((1+interestRate),-(1+loanPeriod -(count +1))));
            principalPrint = Math.round(principalAmount * 100.0) / 100.0;
            data[count][2] = principalPrint; // stores value
            // Interest
            interest = paymentAmount - principalAmount;
            interestPrint = Math.round(interest * 100.0) / 100.0;
            data[count][3] = interestPrint; // stores value
            //Outstanding balance
            loanOutstandingBalance = (interest / interestRate) - principalAmount;
            balancePrint = Math.round(loanOutstandingBalance * 100.0) / 100.0;
            data[count][4] = balancePrint;// stores value
            count++;
        } while (count < totalNumberOfPayments);
    }
    
}

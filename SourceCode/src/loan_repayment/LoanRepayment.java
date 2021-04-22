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
           
        } while (count < totalNumberOfPayments);
    }
    
}

public class CreditPaymentService {

    public double calculate(double loanInterestRate) {
        double percentPerMonth;
        percentPerMonth = (double) (loanInterestRate / (12 * 100));
        return percentPerMonth;
    }

    public double calculate(double loanTermInMonths, double amountOfCredit, double loanInterestRatePerMonth) {
        double monthlyPayment;
        monthlyPayment = (double) (amountOfCredit * (loanInterestRatePerMonth * Math.pow(1 + loanInterestRatePerMonth, loanTermInMonths)) / (Math.pow(1 + loanInterestRatePerMonth, loanTermInMonths) - 1));
        return monthlyPayment;
    }
}

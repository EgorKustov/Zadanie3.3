public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double loanTermInMonths = 24; //Срок кредита в месяцах
        double amountOfCredit = 1_000_000; //Сумма кредита в рублях
        double loanInterestRate = 9.99; //Процентная ставка
        double loanInterestRatePerMonth; //Процентная ставка в месяц
        loanInterestRatePerMonth = service.calculate(loanInterestRate);

        int monthlyPayment; //Ежемесячный платеж
        monthlyPayment = (int) service.calculate(loanTermInMonths, amountOfCredit, loanInterestRatePerMonth);
        System.out.println("Ежемесячный платёж составит " + monthlyPayment + " р.");
    }
}
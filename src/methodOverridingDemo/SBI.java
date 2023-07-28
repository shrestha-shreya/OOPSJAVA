package methodOverridingDemo;

public class SBI extends RBI implements Loan{

    public static void main(String[] args) {
        SBI home = new SBI();
        home.homeLoanIntRate();;
    }

    public void homeLoanIntRate(){
        System.out.println("Home Loan Interest Rate is 9%");
    }

    @Override
    public void homeLoan() {
        System.out.println("SBI Providing Home Loan");
    }

    @Override
    public void carLoan() {
        System.out.println("SBI Providing Car Loan");
    }
}

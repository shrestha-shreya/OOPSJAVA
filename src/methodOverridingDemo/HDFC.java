package methodOverridingDemo;

public class HDFC extends RBI{

    public static void main(String[] args) {

        RBI r = new RBI();
        r.homeLoanIntRate();
    }

    @Override
    public void homeLoanIntRate() {
        System.out.println("Home Loan Interest rate is 11%");
    }
}

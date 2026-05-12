package Template_Method.OnlineBankingTransaction;

public class OnlineBankingMain {
    public static void main(String[] args) {
        BankTransaction t1 = new FundTransfer();
        t1.processTransaction();
        System.out.println();
        BankTransaction t2 = new BillPayment();
        t2.processTransaction();
    }
}


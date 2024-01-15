import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                new Bill(BigDecimal.valueOf(5000), new IncomeTaxType(), taxService),
                new Bill(BigDecimal.valueOf(5000), new ProgressiveTaxType(), taxService),
                new Bill(BigDecimal.valueOf(5000), new VATaxType(), taxService),
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}

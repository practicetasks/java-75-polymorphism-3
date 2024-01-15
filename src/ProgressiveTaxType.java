import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        int result = amount.compareTo(BigDecimal.valueOf(100_000));
//           -1 если меньше 100 000
//           0 если равно 100 000
//           1 если больше 100 000
        if (result <= 0) {
            return amount.multiply(BigDecimal.valueOf(0.1));
        }
        return amount.multiply(BigDecimal.valueOf(0.15));
    }
}

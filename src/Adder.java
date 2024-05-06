import java.math.BigDecimal;
import java.util.List;

public class Adder {
    public int add(int a, int b) {
        return a + b;
    }
    public BigDecimal add(List<BigDecimal> numbers) {
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal num : numbers) {
            sum = sum.add(num);
        }
        return sum;
    }
}
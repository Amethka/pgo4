import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Address address = new Address("Poland", "Warsaw", "00-001", "Main Street", "123");
        System.out.println(address.createAddress("Poland"));
        System.out.println(address.createAddress("Poland", "Warsaw"));
        System.out.println(address.createAddress("Poland", "Warsaw", "00-001"));
        System.out.println(address.createAddress("Poland", "Warsaw", "00-001", "Main Street"));
        System.out.println(address.createAddress("Poland", "Warsaw", "00-001", "Main Street", "123"));
        Adder adder = new Adder();
        int sum1 = adder.add(6,4);
        ArrayList<BigDecimal> x = new ArrayList<>(){};
        x.add(new BigDecimal(1));
        x.add(new BigDecimal(2));
        x.add(new BigDecimal(10));
        BigDecimal sum2 = adder.add(x);

        Multiplier multiplier = new Multiplier();
        int sum3 = multiplier.multiply(1 ,2,3,4);
        int sum4 = multiplier.multiply(1 ,2);
        double sum5 = multiplier.multiply(1.2 ,2.2);
        BigDecimal sum6 = multiplier.multiply(new BigDecimal(1),new BigDecimal(2));
        ArrayList<Integer> y = new ArrayList<>(){};
        y.add(1);
        y.add(3);
        y.add(5);
        int sum7 = multiplier.multiply(y);
    }
}

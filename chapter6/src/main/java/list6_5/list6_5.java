package list6_5;

import java.util.function.*;

public class list6_5 {
    public static void main(String[] args) {

        double b = 1.41;

        IntToDoubleFunction func = (x) -> {
            return x * x * b;
        };

        double a = func.applyAsDouble(5);

        System.out.println(a);
    }
}

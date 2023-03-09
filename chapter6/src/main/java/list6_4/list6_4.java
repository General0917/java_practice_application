package list6_4;

import java.util.function.*;

public class list6_4 {
    public static void main(String[] args) {
        IntBinaryOperator func = (int a, int b) -> { return a - b; };

        int a = func.applyAsInt(5, 3);

        System.out.println("5 - 3 = " + a);
    }
}

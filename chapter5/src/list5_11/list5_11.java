package list5_11;

class Outer {
    int outerField;
    static int outerStaticField;

    static class Inner {
        void innerMethod() {
            outerStaticField = 10;
        }

        int get() {
            outerStaticField = 20;
            return outerStaticField;
        }
    }

    void outerMethod() {
        Inner ic = new Inner();
    }
}

public class list5_11 {
    public static void main(String[] args) {
        Outer.Inner ic = new Outer.Inner();

        System.out.println(ic);
        System.out.println(ic.get());

    }
}

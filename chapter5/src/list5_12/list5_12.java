package list5_12;

class Outer {
    int outerMember;
    void outerMethod() {
        int a = 10;
        class Inner {
            public void innerMethod() {
                System.out.println("innerMethodです！！");
                System.out.println(outerMember);
            }
        }
        Inner ic = new Inner();
        ic.innerMethod();
    }
}

public class list5_12 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerMethod();
    }
}

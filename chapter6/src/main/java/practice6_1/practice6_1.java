package practice6_1;

public class practice6_1 {
    public static void main(String[] args) {
        FuncList funclist = new FuncList();
        Func1 func1 = FuncList::isOdd;
        Func2 func2 = funclist::addNamePrefix;

        System.out.println(func1.call(15));
        System.out.println(func2.call(true, "Wilford"));
    }
}

package list7_5;

public class list7_5 {
    public static void main(String[] args) {
        // Stringに関する情報を取得して表示する
        Class<?> info1 = String.class;

        System.out.println(info1.getSimpleName());
        System.out.println(info1.getName());
        System.out.println(info1.getPackage().getName());

        System.out.println(info1.isArray());

        // Stringの親クラスの情報を取得する
        Class<?> info2 = info1.getSuperclass();
        System.out.println(info2.getName());

        // argsは、きちんと文字列配列として判定される
        Class<?> info3 = args.getClass();
        System.out.println(info3.isArray());
    }
}

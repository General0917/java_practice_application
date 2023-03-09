package list7_6;

import java.lang.reflect.*;

public class list7_6 {
    public static void main(String[] args) throws Exception {
        Class clazz = RefSample.class;

        // 引数1つのコンストラクタを取得し、インスタンスを生成する
        Constructor<?> cons = clazz.getConstructor(int.class);
        RefSample rs = (RefSample) cons.newInstance(256);

        // pubフィールドに関するFieldを取得して読み書き
        Field f = clazz.getField("times");
        f.set(rs, 2);
        System.out.println(f.get(rs));

        // 引数2つのhelloメソッドを取得して呼び出す
        Method m = clazz.getMethod("hello", String.class, int.class);
        m.invoke(rs, "reflection", 128);

        // クラスやメソッドへの修飾（publicやfinalの有無）を調べる
        boolean pubc = Modifier.isPublic(clazz.getModifiers());
        boolean finm = Modifier.isFinal(m.getModifiers());

        System.out.println(pubc);
        System.out.println(finm);
    }
}

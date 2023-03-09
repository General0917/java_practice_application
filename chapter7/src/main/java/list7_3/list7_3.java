package list7_3;

import java.util.*;

public class list7_3 {
    public static void main(String[] args) {
        System.out.println("ご利用のJavaのバージョン：" + System.getProperty("java.version"));
        Properties p = System.getProperties();
        Iterator<String> i = p.stringPropertyNames().iterator();
        System.out.println("【システムプロパティ一覧】");
        while(i.hasNext()) {
            String key = i.next();
            System.out.print(key + " = ");
            System.out.println(System.getProperty(key));
        }
    }
}

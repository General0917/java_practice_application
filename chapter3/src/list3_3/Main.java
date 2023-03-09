package list3_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("sakata");
        names.add("yamamoto");
        names.add("kanou");
        Iterator<String> it = names.iterator();
        while(it.hasNext()) {
            String e = it.next();
            System.out.println(e);
        }
    }
}

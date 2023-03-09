package list3_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("阪田");
        names.add("山本");
        names.add("加納");
        Iterator<String> it = names.iterator();
        System.out.println(it);
//        while(it.hasNext()) {
//            String e = it.next();
//            System.out.println(e);
//        }
    }
}

package list3_4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<String>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");
        System.out.println("色は" + colors.size() + "種類");
    }
}

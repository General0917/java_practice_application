package list10_3;

import java.util.StringTokenizer;

public class list10_3 {
    public static void main(String[] args) {
        String s = "ミナト,アサカ,スガワラ";
        StringTokenizer st = new StringTokenizer(s, ",");

        while(st.hasMoreTokens()) {
            String t = st.nextToken();
            System.out.println(t);
        }
    }
}

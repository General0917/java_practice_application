package list9_5;

import java.io.*;

public class list9_5 {
    public static void main(String[] args) throws IOException {
        String msg = "第1土曜日";
        Reader sr = new StringReader(msg);

        int i = sr.read();
        try {
            while (i != -1) {
                char c = (char) i;
                System.out.print(c);
                i = sr.read();
            }
        } catch (IOException e) {
            System.out.println("読み込みエラーが発生しました。");
        } finally {
            if (sr != null) {
                try {
                    sr.close();
                } catch (IOException e2) {

                }
            }
        }
    }
}

package list9_2;

import java.io.*;

public class list9_2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\General\\Documents\\Practice\\Java\\application\\chapter9\\src\\main\\java\\list9_2\\list9_2.txt");

        System.out.println("すべてのデータを読み込んで表示します。");

        int i = fr.read();

        while (i != -1) {
            char c = (char) i;
            System.out.print(c);
            i = fr.read();
        }

        System.out.println();
        System.out.println("ファイルの末尾に到達しました。");
        fr.close();
    }
}

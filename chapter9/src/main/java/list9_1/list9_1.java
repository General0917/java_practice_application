package list9_1;

import java.io.*;

public class list9_1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\General\\Documents\\Practice\\Java\\application\\chapter9\\src\\main\\java\\list9_1\\list9_1.txt", true);

        fw.write("testコードの作成");
        fw.flush();
        fw.close();
    }
}

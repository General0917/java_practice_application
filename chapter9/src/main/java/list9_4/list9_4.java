package list9_4;

import java.io.*;

public class list9_4 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = null;
        try {
            fw = new FileWriter("C:\\Users\\General\\Documents\\Practice\\Java\\application\\chapter9\\src\\main\\java\\list9_4\\list9_4.txt", true);
            fw.write('A');
            fw.flush();
        } catch (IOException e) {
            System.out.println("ファイルの書き込みエラーです。");
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e2) {

                }
            }
        }
    }
}

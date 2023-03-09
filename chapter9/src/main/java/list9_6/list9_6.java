package list9_6;

import java.io.*;

public class list9_6 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(65);
        baos.write(66);

        byte[] data = baos.toByteArray();

        FileWriter fw = null;
        System.out.println(data);

        try {
            fw = new FileWriter("C:\\Users\\General\\Documents\\Practice\\Java\\application\\chapter9\\src\\main\\java\\list9_6\\list9_6.txt", true);
            fw.write(String.valueOf(data));
            fw.flush();
        } catch (IOException e) {
            System.out.println("バイト配列の書き込みにエラーが発生しました。");
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e2) {

            }
        }
    }
}

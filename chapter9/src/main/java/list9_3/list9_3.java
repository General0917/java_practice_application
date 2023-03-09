package list9_3;

import java.io.*;

public class list9_3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\General\\Documents\\Practice\\Java\\application\\chapter9\\src\\main\\java\\list9_3\\list9_3.txt", true);

        fos.write(65);
        fos.flush();
        fos.close();
    }
}

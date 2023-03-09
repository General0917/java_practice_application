package list10_5;

import java.io.*;
import java.util.*;

public class list10_5 {
    public static void main(String[] args) throws IOException {
        Writer fw = new FileWriter("C:\\Users\\General\\Documents\\Practice\\Java\\application\\chapter10\\src\\main\\java\\list10_5\\list10_5.properties");
        Properties p = new Properties();
        p.setProperty("heroName", "test_user2");
        p.setProperty("heroHp", "550");
        p.setProperty("heroMp", "250");

        p.store(fw, "勇者のステータス");
        fw.close();
    }
}

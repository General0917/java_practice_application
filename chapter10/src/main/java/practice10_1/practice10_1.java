package practice10_1;

import java.io.*;
import java.util.*;

public class practice10_1 {
    public static void main(String[] args) throws Exception {
        Reader fr = new FileReader("C:\\Users\\General\\Documents\\Practice\\Java\\application\\chapter10\\src\\main\\java\\practice10_1\\pref.properties");
        Properties p = new Properties();

        p.load(fr);
        System.out.println(p.getProperty("aichi.capital") + ":" + p.getProperty("aichi.food"));
        fr.close();
    }
}

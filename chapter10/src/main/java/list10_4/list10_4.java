package list10_4;

import java.io.*;
import java.util.*;

public class list10_4 {
    public static void main(String[] args) throws IOException {
        Reader fr = new FileReader("C:\\Users\\General\\Documents\\Practice\\Java\\application\\chapter10\\src\\main\\java\\list10_4\\list10_4.properties");
        Properties p = new Properties();

        p.load(fr);
        String name = p.getProperty("heroName");
        String strHp = p.getProperty("heroHp");
        String strMp = p.getProperty("heroMp");

        int hp = Integer.parseInt(strHp);
        int mp = Integer.parseInt(strMp);

        System.out.println("勇者の名前：" + name);
        System.out.println("勇者のHP：" + hp);
        System.out.println("勇者のMP：" + mp);
        fr.close();


    }
}

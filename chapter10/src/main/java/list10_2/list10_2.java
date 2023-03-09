package list10_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class list10_2 {
    public static void main(String[] args) throws IOException {
       Hero h = new Hero("test2", 500, 50);

        h.getName();
        h.getHp();
        h.getMp();

        saveHeroToFile(h);
    }

    public static void saveHeroToFile(Hero h) throws IOException {
        Writer w = new BufferedWriter(new FileWriter("C:\\Users\\General\\Documents\\Practice\\Java\\application\\chapter10\\src\\main\\java\\list10_2\\list10_2.csv"));

        w.write(h.getName());
        w.write(",");
        w.write(h.getHp());
        w.write(",");
        w.write(h.getMp());
        w.flush();
        w.close();
    }
}

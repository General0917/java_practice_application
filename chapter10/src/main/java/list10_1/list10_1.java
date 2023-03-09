package list10_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class list10_1 {
    public static void main(String[] args) throws IOException {
        Hero h = new Hero("test1", 500, 50);

        h.getName();
        h.getHp();
        h.getMp();

        saveHeroToFile(h);
    }

    public static void saveHeroToFile(Hero h) throws IOException {
        Writer w = new BufferedWriter(new FileWriter("C:\\Users\\General\\Documents\\Practice\\Java\\application\\chapter10\\src\\main\\java\\list10_1\\list10_1.txt"));

        w.write(h.getName() + "\n");
        w.write(h.getHp() + "\n");
        w.write(h.getMp() + "\n");
        w.flush();
        w.close();
    }
}

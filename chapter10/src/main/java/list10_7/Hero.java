package list10_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Hero {
    private String name;
    private int hp;
    private int mp;

    public Hero(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public int getMp() {
        return this.mp;
    }

    public static Hero loadHeroFromFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\General\\Documents\\Practice\\Java\\application\\chapter10\\src\\main\\java\\list10_7\\list10_7.dat"));

        String name = br.readLine();
        String hp = br.readLine();
        String mp = br.readLine();

        Hero h = new Hero(name, Integer.parseInt(hp), Integer.parseInt(mp));

        System.out.println(h.getName());
        System.out.println(h.getHp());
        System.out.println(h.getMp());
        return h;
    }
}
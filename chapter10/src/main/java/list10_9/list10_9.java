package list10_9;

import java.io.*;

public class list10_9 {
    public static void main(String[] args) throws Exception {
        Hero hero1 = new Hero("test_user_hero9", 575, 250);

        // インスタンスの直列化と保存
        FileOutputStream fos = new FileOutputStream("C:\\Users\\General\\Documents\\Practice\\Java\\application\\chapter10\\src\\main\\java\\list10_9\\list10_9.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(hero1);
        oos.flush();
        oos.close();

        // ファイルからインスタンスを復元
        FileInputStream fis = new FileInputStream("C:\\Users\\General\\Documents\\Practice\\Java\\application\\chapter10\\src\\main\\java\\list10_9\\list10_9.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Hero hero2 = (Hero) ois.readObject();
        ois.close();
    }
}

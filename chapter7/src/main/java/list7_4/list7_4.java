package list7_4;

public class list7_4 {
    public static void main(String[] args) {
//         String ver = System.getProperty("rpg.version");
//         String author = System.getProperty("rpg.author");

        String ver = System.getProperty("rpg.version", "0.3");
        String author = System.getProperty("rpg.author", "Hero");

        System.out.println(ver);
        System.out.println(author);

        long f = Runtime.getRuntime().freeMemory();
        long t = Runtime.getRuntime().totalMemory();
        long m = Runtime.getRuntime().maxMemory();

        // 残りのメモリ容量を出力する（バイト数で表示）
        System.out.println(f);

        // 現在のメモリ総容量を出力する（バイト数で表示）
        System.out.println(t);

        // メモリの総容量の限界値を出力する（バイト数で表示）
        System.out.println(m);
    }
}

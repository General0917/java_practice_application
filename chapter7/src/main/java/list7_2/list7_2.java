package list7_2;

public class list7_2 {
    public static void main(String[] args) throws Exception {
        System.out.println("プログラム実行時に、メモ帳を自動起動します。");

        ProcessBuilder pb = new ProcessBuilder(
                "C:\\Windows\\system32\\notepad.exe",
                "C:\\Users\\General\\Documents\\Practice\\Java\\application\\chapter7\\src\\main\\java\\list7_2\\sum.txt"
        );

        pb.start();
    }
}

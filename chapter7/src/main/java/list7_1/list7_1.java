package list7_1;

public class list7_1 {
    public static void main(String[] args) {
        final boolean toggle = true;

        if (toggle) {
            System.out.println("データが壊れています。異常終了します");
            System.exit(1);
        }
        System.out.println("正常終了しました。");
    }
}

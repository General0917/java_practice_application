import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class practice1 {
    public static void main(String[] args) {

        // ①現在の日付をDate型で取得します
        Date now = new Date();

        // ②取得した日付情報をCalenderにセットします。
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        c.setTime(now);

        // ③Calendarから「日」の数値を取得します。
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        // ④取得した値に100を足した値をCalendarの「日」にセットします。
        day += 100;
        c.set(Calendar.DAY_OF_MONTH, day);
        System.out.println(day);

        // ⑤Calendarの日付情報をDate型に変換します。
        Date future = c.getTime();
        System.out.println(future);

        // ⑥SimpleDateFormatを用いて、指定された形式でDateインスタンスの内容を表示します。
        SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
        System.out.println(f.format(future));
    }
}
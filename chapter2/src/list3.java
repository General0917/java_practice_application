import java.time.*;

public class list3 {
    public static void main(String[] args) {
        // LocalDateTimeの生成方法
        LocalDateTime l1 = LocalDateTime.now();
        LocalDateTime l2 = LocalDateTime.of(2014, 1, 1, 9, 5, 0, 0);

        // LocalDateTimeとZonedDateTimeの相互変換
        ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
        LocalDateTime l3 = z1.toLocalDateTime();

        System.out.println("LocalDateTime：" + l2.getYear() + l2.getMonth() + l2.getDayOfMonth());
        System.out.println("ZonedDateTime：" + z1.getYear() + z1.getMonth() + z1.getDayOfMonth());
    }
}
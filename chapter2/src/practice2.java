import java.time.*;
import java.time.format.*;

public class practice2 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate future = now.plusDays(100);
        System.out.println(future);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        System.out.println(f.format(future));
    }
}
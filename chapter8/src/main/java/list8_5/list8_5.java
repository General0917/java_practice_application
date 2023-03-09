package list8_5;

import org.apache.commons.logging.*;

public class list8_5 {
    public static void main(String[] args) {
        Log logger = LogFactory.getLog(list8_5.class);

        if (args.length != 2) {
            logger.error("起動引数の数が異常：" + args.length);
        }
    }
}

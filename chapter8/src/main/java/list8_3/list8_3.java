package list8_3;

import org.apache.commons.lang3.builder.*;

public class list8_3 {
    String name;
    String address;

    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }
}

package list8_4;

import org.apache.commons.lang3.builder.*;

public class list8_4 {
    String name;
    String address;

    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}

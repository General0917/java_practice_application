package list8_2;

public class list8_2 {
    String name;
    String address;

    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null) return false;
        if(!(o instanceof list8_2)) return false;

        list8_2 r = (list8_2) o;
        if(!this.name.equals(r.name)) return false;
        if(!this.name.equals((r.address))) return false;
        return true;
    }
}

package list5_5;

class Pocket<String> {
    private String data;
    public void put(String d) {
        this.data = d;
    }

    public String get() {
        return this.data;
    }
}

public class list5_5 {
    public static void main(String[] args) {
        Pocket<String> p = new Pocket<String>();
        p.put("1192");
        String s = p.get();
        System.out.println(s);
    }
}

package list5_2;

class Pocket {
    private Object data;
    public void put(Object o) {
        this.data = data;
    }

    public Object get() {
        return this.data;
    }
}

public class list5_2 {
    public static void main(String[] args) {
        Pocket p = new Pocket();
        p.put("1192");
        String s = (String) p.get();
        System.out.println(s);
    }
}

package list10_2;

public class Hero {
    private String name;
    private int hp;
    private int mp;

    public Hero(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public int getMp() {
        return this.mp;
    }
}

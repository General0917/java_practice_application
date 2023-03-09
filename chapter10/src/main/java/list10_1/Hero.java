package list10_1;

public class Hero {
    private String name;
    private int hp;
    private int mp;

    public Hero(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setHp(int hp) {
//        this.hp = hp;
//    }
//
//    public void setMp(int mp) {
//        this.mp = mp;
//    }

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

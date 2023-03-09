package list7_6;

public class RefSample {
    public int times = 0;

    public RefSample(int t) {
        this.times = t;
    }

    public void hello(String msg) {
        this.hello(msg, this.times);
    }

    public void hello(String msg, int t) {
        System.out.println("Hello," + msg + " x" + t);
    }

//    finalが定義している場合は、trueが出力される
//    public void hello(String msg, int t) {
//        System.out.println("Hello," + msg + " x" + t);
//    }
}

package practice5_2;

enum KeyType {PADLOCK, BUTTON, DIAL, FINGER}

class StrongBox<E> {
    private KeyType KeyType;
    private E item;
    private long count;
    public StrongBox(KeyType key) {
        this.KeyType = key;
    }

    public void put(E i) {
        this.item = i;
    }

    public E get() {
        this.count++;
        switch(this.KeyType) {
            case PADLOCK:
                if (count < 1024) return null;
                break;
            case BUTTON:
                if (count < 10000) return null;
                break;
            case DIAL:
                if (count < 30000) return null;
                break;
            case FINGER:
                if (count < 1000000) return null;
                break;
        }
        this.count = 0;
        return this.item;
    }
}

public class practice5_2 {
    public static void main(String[] args) {
        
    }
}

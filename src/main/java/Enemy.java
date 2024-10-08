public class Enemy {
    private int life;
    private int x;

    ClassImpl(int x) {
        this.x = x;
    }

    public int add(int i) {
        return i + x;
    }

    public int subtract(int i) {
        return i - x;
    }

    public boolean attack() {
        this.life--;

        if (this.life == 0) {
            return true;
        } else {
            return false;
        }
    }
}

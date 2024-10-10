public class PlayingCharacter {
    private int life;

    public boolean attack(Enemy enem) {
        this.life--;

        if (this.life == 0) {
            return true;
        } else {
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Enemy enem = new Enemy();
        PlayingCharacter chara = new PlayingCharacter();

        while (isEnemAlive && isCharaAlive) {
            //turno di chara
            CharasTurn = enem.attack();
        }

        List pippo = List.of();
    }
}

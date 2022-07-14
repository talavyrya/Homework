package homework.task12;

public class Final {
    public static void main(String[] args) {
        Team player1 = new Player1("Robert", 35, "Poland");
        Team player2 = new Player2("Artem", 25, "Ukraine");
        Team one = new Team();
        Team liverpool = new Team();
        player1.play();
        player2.play();
        one.play();
        game(player1);
        game(player2);
    }
    public static void game(Team liverpool) {
        liverpool.play();
    }
}

import java.util.ArrayList;
import java.util.List;

public class GameMode {

    public static void computer() {

    }

    public static void pvp() {

        System.out.println("Player 1, type your name: ");
        String name = Game.input.next();
        System.out.println("Player 2, type your name: ");
        String name1 = Game.input.next();
        System.out.println("Select your marker: (x or o)");
        Character marker = Game.input.next().charAt(0);
        System.out.println("Select your marker: (x or o)");
        Character marker1 = Game.input.next().charAt(0);

        while (marker1.equals(marker)) {
            System.out.printf("[%c] is already selected", marker);
            marker1 = Game.input.next().charAt(0);
        }

        Players player1 = new Players(name, marker);
        Players player2 = new Players(name1, marker1);
    }

    private static void game(Players player1, Players player2) {
        do {
            System.out.printf("%s, you turn: ", player1.getName());
            int move = Game.input.nextInt();
            while (Board.setPosition(move, player1.getMarker()).equals("Invalid move")) {
                System.out.println("Invalid move \nTry again: ");
                move = Game.input.nextInt();
            }
            System.out.printf("%s, you turn: ", player2);
            int move1 = Game.input.nextInt();
            while (Board.setPosition(move, player1.getMarker()).equals("Invalid move")) {
                System.out.println("Invalid move \nTry again: ");
                move1 = Game.input.nextInt();
            }
        } while (endGame() == false);
    }

    private static boolean endGame() {
        for (int i = 0; i < Board.board.length; i++) {
            for (int j = 0; j < Board.board[i].length; j++) {
                boolean x = Board.board[i][j].equals(' ');
                List<String> list = new ArrayList<>(8);
                list.add(String.valueOf(x));
            }
            return true;
        }
            return false;
    }

    }



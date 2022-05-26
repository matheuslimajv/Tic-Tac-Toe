import java.util.ArrayList;
import java.util.List;

public class GameMode {

    public static void computer() {

    }

    public static void pvp() {
        Game.clearScreen();
        System.out.println("Player 1, type your name: ");
        String name = Game.input.next();
        System.out.println("Select your marker: (x or o)");
        Character marker = Game.input.next().charAt(0);
        System.out.println("Player 2, type your name: ");
        String name1 = Game.input.next();
        System.out.println("Select your marker: (x or o)");
        Character marker1 = Game.input.next().charAt(0);

        while (marker1.equals(marker)) {
            System.out.printf("[%c] is already selected", marker);
            marker1 = Game.input.next().charAt(0);
        }

        Players player1 = new Players(name, marker);
        Players player2 = new Players(name1, marker1);
        game(player1, player2);

    }


    private static void game(Players player1, Players player2) {


        Board.setInitialBoard();
        while (draw(player1, player2) || endGame(player1, player2)){

            System.out.printf("%s : %d \t%s : %d\n", player1.getName(), player1.getPoints(), player2.getName(),
                               player2.getPoints());
            System.out.println();
            System.out.println(Board.printBoard());

            System.out.printf("%s, you turn: ", player1.getName());
            int move = Game.input.nextInt();
            Board.setPosition(move, player1.getMarker());
            Game.clearScreen();

            if (!draw(player1, player2) || !endGame(player1, player2)){
                break;
            }

            System.out.printf("%s : %d \t%s : %d\n", player1.getName(), player1.getPoints(), player2.getName(),
                               player2.getPoints());
            System.out.println();
            System.out.println(Board.printBoard());
            System.out.printf("%s, you turn: ", player2.getName());
            int move1 = Game.input.nextInt();
            Board.setPosition(move1, player2.getMarker());
            Game.clearScreen();

            if (!draw(player1, player2) || !endGame(player1, player2)){
                break;
            }
        }

    }

    private static boolean draw(Players player1, Players player2) {
        List<Boolean> list = new ArrayList<>(9);
        Boolean y = null;
        for (int i = 0; i < Board.board.length; i++) {

            for (int j = 0; j < Board.board[i].length; j++) {
                boolean x;
                x = Board.board[i][j].equals(' ');
                list.add(x);
                y = list.contains(true);
            }
        }


        assert y != null;
        if (y.equals(false) && endGame(player1, player2)) {

            System.out.println("Game is a draw");
            player2.setPoints(50);
            player1.setPoints(50);
            System.out.printf("%s : %d points\n", player1.getName(), player1.getPoints());
            System.out.printf("%s : %d points\n", player2.getName(), player2.getPoints());

            System.out.println("Do you want play again ? (y/n)");
            char option = Game.input.next().charAt(0);

            switch (option) {

                case 'y' -> game(player1, player2);
                case 'n' -> {
                    Game.clearScreen();
                    System.exit(0);
                }
            }


        }
        return true;
    }
    public static boolean endGame(Players player1, Players player2) {
        if (Board.board[0][0].equals(player1.getMarker()) && Board.board[0][1].equals(player1.getMarker()) && Board.board[0][2].equals(player1.getMarker())) {
            System.out.printf("%s wins !!!\n", player1.getName());
            player1.setPoints(100);
            System.out.println("Do you play an another game ? ");

            char option = Game.input.next().charAt(0);

            switch (option){

                case 'y' -> game(player1, player2);
                case 'n' -> {
                    Game.clearScreen();
                    System.exit(0);
                }

            }

        } else if (Board.board[1][0].equals(player1.getMarker()) && Board.board[1][1].equals(player1.getMarker()) && Board.board[1][2].equals(player1.getMarker())) {
            System.out.printf("%s wins !!!\n", player1.getName());
            player1.setPoints(100);
            System.out.println("Do you play an another game ? ");

            char option = Game.input.next().charAt(0);

            switch (option){

                case 'y' -> game(player1, player2);
                case 'n' -> {
                    Game.clearScreen();
                    System.exit(0);
                }

            }
        } else if (Board.board[2][0].equals(player1.getMarker()) && Board.board[2][1].equals(player1.getMarker()) && Board.board[2][2].equals(player1.getMarker())) {
            System.out.printf("%s wins !!!\n", player1.getName());
            player1.setPoints(100);
            System.out.println("Do you play an another game ? ");

            char option = Game.input.next().charAt(0);

            switch (option){

                case 'y' -> game(player1, player2);
                case 'n' -> {
                    Game.clearScreen();
                    System.exit(0);
                }

            }
        } else if (Board.board[0][0].equals(player1.getMarker()) && Board.board[1][0].equals(player1.getMarker()) && Board.board[2][0].equals(player1.getMarker())) {
            System.out.printf("%s wins !!!\n", player1.getName());
            player1.setPoints(100);
            System.out.println("Do you play an another game ? ");

            char option = Game.input.next().charAt(0);

            switch (option){

                case 'y' -> game(player1, player2);
                case 'n' -> {
                    Game.clearScreen();
                    System.exit(0);
                }

            }
        } else if (Board.board[0][1].equals(player1.getMarker()) && Board.board[1][1].equals(player1.getMarker()) && Board.board[2][1].equals(player1.getMarker())) {
            System.out.printf("%s wins !!!\n", player1.getName());
            player1.setPoints(100);
            System.out.println("Do you play an another game ? ");

            char option = Game.input.next().charAt(0);

            switch (option){

                case 'y' -> game(player1, player2);
                case 'n' -> {
                    Game.clearScreen();
                    System.exit(0);
                }

            }
        } else if (Board.board[0][2].equals(player1.getMarker()) && Board.board[1][2].equals(player1.getMarker()) && Board.board[2][2].equals(player1.getMarker())) {
            System.out.printf("%s wins !!!\n", player1.getName());
            player1.setPoints(100);
            System.out.println("Do you play an another game ? ");

            char option = Game.input.next().charAt(0);

            switch (option){

                case 'y' -> game(player1, player2);
                case 'n' -> {
                    Game.clearScreen();
                    System.exit(0);
                }

            }
        } else if (Board.board[0][0].equals(player1.getMarker()) && Board.board[1][1].equals(player1.getMarker()) && Board.board[2][2].equals(player1.getMarker())) {
            System.out.printf("%s wins !!!\n", player1.getName());
            player1.setPoints(100);
            System.out.println("Do you play an another game ? ");

            char option = Game.input.next().charAt(0);

            switch (option){

                case 'y' -> game(player1, player2);
                case 'n' -> {
                    Game.clearScreen();
                    System.exit(0);
                }

            }
        } else if (Board.board[0][2].equals(player1.getMarker()) && Board.board[1][1].equals(player1.getMarker()) && Board.board[2][0].equals(player1.getMarker())) {
            System.out.printf("%s wins !!!\n", player1.getName());
            player1.setPoints(100);
            System.out.println("Do you play an another game ? ");

            char option = Game.input.next().charAt(0);

            switch (option){

                case 'y' -> game(player1, player2);
                case 'n' -> {
                    Game.clearScreen();
                    System.exit(0);
                }

            }
        } else if (Board.board[0][0].equals(player2.getMarker()) && Board.board[0][1].equals(player2.getMarker()) && Board.board[0][2].equals(player2.getMarker())) {
            System.out.printf("%s wins !!!\n", player2.getName());
            player2.setPoints(100);
            System.out.println("Do you play an another game ? ");

            char option = Game.input.next().charAt(0);

            switch (option){

                case 'y' -> game(player1, player2);
                case 'n' -> {
                    Game.clearScreen();
                    System.exit(0);
                }

            }
            } else if (Board.board[1][0].equals(player2.getMarker()) && Board.board[1][1].equals(player2.getMarker()) && Board.board[1][2].equals(player2.getMarker())) {
            System.out.printf("%s wins !!!\n", player2.getName());
            player2.setPoints(100);
            System.out.println("Do you play an another game ? ");

            char option = Game.input.next().charAt(0);

            switch (option){

                case 'y' -> game(player1, player2);
                case 'n' -> {
                    Game.clearScreen();
                    System.exit(0);
                }

            }
            } else if (Board.board[2][0].equals(player2.getMarker()) && Board.board[2][1].equals(player2.getMarker()) && Board.board[2][2].equals(player2.getMarker())) {
            System.out.printf("%s wins !!!\n", player2.getName());
            player2.setPoints(100);
            System.out.println("Do you play an another game ? ");

            char option = Game.input.next().charAt(0);

            switch (option){

                case 'y' -> game(player1, player2);
                case 'n' -> {
                    Game.clearScreen();
                    System.exit(0);
                }

            }
            } else if (Board.board[0][0].equals(player2.getMarker()) && Board.board[1][0].equals(player1.getMarker()) && Board.board[2][0].equals(player2.getMarker())) {
            System.out.printf("%s wins !!!\n", player2.getName());
            player2.setPoints(100);
            System.out.println("Do you play an another game ? ");

            char option = Game.input.next().charAt(0);

            switch (option){

                case 'y' -> game(player1, player2);
                case 'n' -> {
                    Game.clearScreen();
                    System.exit(0);
                }

            }
            } else if (Board.board[0][1].equals(player2.getMarker()) && Board.board[1][1].equals(player2.getMarker()) && Board.board[2][1].equals(player2.getMarker())) {
            System.out.printf("%s wins !!!\n", player2.getName());
            player2.setPoints(100);
            System.out.println("Do you play an another game ? ");

            char option = Game.input.next().charAt(0);

            switch (option){

                case 'y' -> game(player1, player2);
                case 'n' -> {
                    Game.clearScreen();
                    System.exit(0);
                }

            }
            } else if (Board.board[0][2].equals(player2.getMarker()) && Board.board[1][2].equals(player2.getMarker()) && Board.board[2][2].equals(player2.getMarker())){
            System.out.printf("%s wins !!!\n", player2.getName());
            player2.setPoints(100);
            System.out.println("Do you play an another game ? ");

            char option = Game.input.next().charAt(0);

            switch (option){

                case 'y' -> game(player1, player2);
                case 'n' -> {
                    Game.clearScreen();
                    System.exit(0);
                }

            }
            } else if (Board.board[0][0].equals(player2.getMarker()) && Board.board[1][1].equals(player2.getMarker()) && Board.board[2][2].equals(player2.getMarker())) {
            System.out.printf("%s wins !!!\n", player2.getName());
            player2.setPoints(100);
            System.out.println("Do you play an another game ? ");

            char option = Game.input.next().charAt(0);

            switch (option){

                case 'y' -> game(player1, player2);
                case 'n' -> {
                    Game.clearScreen();
                    System.exit(0);
                }

            }
            } else if (Board.board[0][2].equals(player2.getMarker()) && Board.board[1][1].equals(player2.getMarker()) && Board.board[2][0].equals(player2.getMarker())) {
            System.out.printf("%s wins !!!\n", player2.getName());
            player2.setPoints(100);
            System.out.println("Do you play an another game ? ");

            char option = Game.input.next().charAt(0);

            switch (option){

                case 'y' -> game(player1, player2);
                case 'n' -> {
                    Game.clearScreen();
                    System.exit(0);
                }

            }


        }


     return true;
    }
}
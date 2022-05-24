import java.util.Arrays;

public class Board {
    public static Character[][] board = new Character[3][3];

    public static void setInitialBoard() {
        for (Character[] characters : board) {
            Arrays.fill(characters, ' ');
        }
    }

    public static void setPosition(int move, char marker) {
        if (move == 1 && board[0][0].equals(' ')) {
            board[0][0] = marker;
        } else if (move == 2 && board[0][1].equals(' ')) {
            board[0][1] = marker;
        } else if (move == 3 && board[0][2].equals(' ')) {
            board[0][2] = marker;
        } else if (move == 4 && board[1][0].equals(' ')) {
            board[1][0] = marker;
        } else if (move == 5 && board[1][1].equals(' ')) {
            board[1][1] = marker;
        } else if (move == 6 && board[1][2].equals(' ')) {
            board[1][2] = marker;
        } else if (move == 7 && board[2][0].equals(' ')) {
            board[2][0] = marker;
        } else if (move == 8 && board[2][1].equals(' ')) {
            board[2][1] = marker;
        } else if (move == 9 && board[2][2].equals(' ')) {
            board[2][2] = marker;
        } else {
            String x = ("Invalid move");
            while(true){
                System.out.printf("%s try again: ", x);
                move = Game.input.nextInt();
                setPosition(move, marker);
        }
    }
}
    public static String printBoard(){
        return String.format("""
                        \t| %c | %c | %c |
                        \t| %c | %c | %c |
                        \t| %c | %c | %c |
                        """
                ,board[0][0],board[0][1],board[0][2],
                board[1][0],board[1][1],board[1][2],
               board[2][0],board[2][1],board[2][2]);

    }
}

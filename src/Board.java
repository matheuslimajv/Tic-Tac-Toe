public class Board {
    public static Character board[][] = new Character[3][3];

    public static void setInitialBoard() {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = ' ';
            }
        }
    }

    public static String setPosition(int move, char marker) {
        if (move == 1 && board[0][0] == ' ') {
            board[0][0] = marker;
        } else if (move == 2 && board[0][1] == ' ') {
            board[0][1] = marker;
        } else if (move == 2 && board[0][2] == ' ') {
            board[0][2] = marker;
        } else if (move == 2 && board[1][0] == ' ') {
            board[1][0] = marker;
        } else if (move == 2 && board[1][1] == ' ') {
            board[1][1] = marker;
        } else if (move == 2 && board[1][2] == ' ') {
            board[1][2] = marker;
        } else if (move == 2 && board[2][0] == ' ') {
            board[2][0] = marker;
        } else if (move == 2 && board[2][1] == ' ') {
            board[2][1] = marker;
        } else if (move == 2 && board[2][2] == ' ') {
            board[2][2] = marker;
        }
            return ("Invalid move");
    }

    public static String printBoard(){
        return String.format("%c|%c|%c|" +
                            "|%c|%c|%c|" +
                            "|%c|%c|%c|"
                ,board[0][0],board[0][1],board[0][2],
                 board[1][0],board[1][1],board[1][2],
                board[2][0],board[2][1],board[2][2]);

    }
}

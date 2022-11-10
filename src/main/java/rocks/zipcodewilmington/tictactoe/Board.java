package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private Character[][] board;

    public Board(Character[][] matrix) {
        board = matrix;
    }

    public Boolean isInFavorOfX() {
        char x = 'X';
        return checkRow(x) || checkCol(x) || checkDiag(x);
    }

    public Boolean isInFavorOfO() {
        char o = 'O';
        return checkRow(o) || checkCol(o) || checkDiag(o);
    }

    public Boolean isTie() {
        return !isInFavorOfX() && !isInFavorOfO();
    }

    public String getWinner() {
        if(isInFavorOfO()) {
            return "O";
        } else if (isInFavorOfX()) {
            return "X";
        } else {
            return "";
        }
    }

    public boolean checkRow(char letter) {
        for (int i = 0 ; i < 3 ; i++) { //vertically
            for(int j = 0 ; j <= 0 ; j++) { //row
                if (board[i][j] == letter && board[i][j+1] == letter && board[i][j+2] == letter) {
                    return true; //checks for valid row for char and returns true
                }
            }
        }
        return false;
    }

    public boolean checkCol(char letter) {
        for (int i = 0 ; i < 3 ; i++) { //
            for(int j = 0 ; j <= 0 ; j++) {
                if (board[j][i] == letter && board[j+1][i] == letter && board[j+2][i] == letter) {
                    return true; //checks for valid col for char and returns true
                }
            }
        }
        return false;
    }

    public boolean checkDiag(char letter) {
        if(board[1][1] == letter) {
            return (board[0][0] == letter && board[2][2] == letter) ||
                    (board[0][2] == letter && board[2][0] == letter);
        }
        return false;
    }

}

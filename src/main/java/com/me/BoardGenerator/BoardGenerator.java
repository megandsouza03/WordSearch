package com.me.BoardGenerator;

import java.util.Random;

public class BoardGenerator {
    static public char [][] board  ;
    int rows  ;
    int cols ;

    Random rand ;

    public BoardGenerator( int rows, int cols) throws IllegalArgumentException{

        if(rows != cols) throw new IllegalArgumentException();

        this.rows = (rows == 0) ? 15 : rows;
        this.cols = (cols == 0) ? 15 : cols;
        this.board = new char[this.rows][this.cols];
        rand = new Random();
    }

    public char[][] getBoard() {
        return board;
    }

    public int getRows() {
        return rows;
    }


    public int getCols() {
        return cols;
    }

    public void generateBoard(){
        for(int i = 0 ;i<rows;i++){
            for(int j =0 ;j<cols;j++){
                board[i][j] = (char) (rand.nextInt(26)+'a');
            }
        }
    }

    public static void setBoard(char[][] board) {
        BoardGenerator.board = board;
    }

    public  void printBoard(){
        for(int i = 0 ;i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

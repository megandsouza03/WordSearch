package com.me.Driver;

import com.me.BoardGenerator.BoardGenerator;
import com.me.WordSearch.WordSearch;

public class Driver {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int n;

        try {
            n = Integer.parseInt(args[0]);

        }catch (Exception e){
            n = 0 ;
        }

        BoardGenerator bg = new BoardGenerator(n,n);
        bg.generateBoard();
        bg.printBoard();
        WordSearch ws = new WordSearch();
        System.out.println(ws.wordSearch(args[1]));
        System.out.println("Time Taken by the program: "+(System.nanoTime() - startTime)/1000000+"ms");
    }
}

package com.me.WordSearch;

import com.me.BoardGenerator.BoardGenerator;
import com.me.WordDictionary.Trie;
import com.me.WordDictionary.WordDictionary;

import java.util.ArrayList;

public class WordSearch {
    public static ArrayList<String> wordSearch(String fileName){
        ArrayList<String> result = new ArrayList<String>();

        int r = BoardGenerator.board.length;
        int c = BoardGenerator.board[0].length;

        WordDictionary wordDictionary = new WordDictionary();
        try {
            wordDictionary.readTxtFile(fileName);
        }catch (Exception e) {
            e.printStackTrace();
        }

        Trie trie = wordDictionary.getTrie();

        boolean[][] visited = new boolean[r][c];

        //Consider every element in the grid as a starting point
        for(int i =0 ;i<r;i++)
            for(int j =0 ;j<c;j++){
                helper(i,j,trie,result);
            }




        return new ArrayList<String>(result);
    }


    public static void helper(int row, int col, Trie trie,ArrayList<String> result){

        int r = BoardGenerator.board.length;
        int c = BoardGenerator.board[0].length;

        //PreDefined all 8 Directions from a given element
        int x[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int y[] = { -1, 0, 1, -1, 1, -1, 0, 1 };


        // Traversing in all 8 Directions
        for (int dir = 0; dir < 8; dir++)
        {  StringBuilder currentWord = new StringBuilder();

            currentWord.append(BoardGenerator.board[row][col]);

            int  rd = row + x[dir], cd = col + y[dir];

            //as along current prefix is a part of the dictionary
            while(trie.startsWith(currentWord.toString()))
            {   //Out of bound Check
                if (rd >= r || rd < 0 || cd >= c || cd < 0)
                    break;

                currentWord.append(BoardGenerator.board[rd][cd]);
                // move in one direction
                rd += x[dir];
                cd += y[dir];

                //If the current word exist then add to the result list
                if(trie.search(currentWord.toString()) && !result.contains(currentWord.toString())) result.add(currentWord.toString());

            }



        }
    }
}

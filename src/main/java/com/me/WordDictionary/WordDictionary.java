package com.me.WordDictionary;

import java.io.File;
import java.util.Scanner;

public class WordDictionary {
    public Trie trie  ;

    public WordDictionary() {
        this.trie = new Trie();
    }

    //Method to read the Words.Txt File and Build a Dictionary
    public void readTxtFile(String fileName) throws Exception{

        String name = getClass().getClassLoader().getResource(fileName).getPath();
        File file = new File(name);
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
            trie.insert(scanner.nextLine());
        }


    }

    public Trie getTrie() {
        return trie;
    }

}

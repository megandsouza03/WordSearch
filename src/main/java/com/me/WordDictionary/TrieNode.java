package com.me.WordDictionary;

import java.util.HashMap;

public class TrieNode {
    HashMap<Character, TrieNode> children ;
    boolean isEnd ;

    public TrieNode(){
        children = new HashMap();
        isEnd = false;
    }
}

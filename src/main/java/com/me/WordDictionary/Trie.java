package com.me.WordDictionary;

public class Trie {
    static TrieNode  root;

    public Trie() {
        root = new TrieNode();

    }

    //method for inserting a new word
    public void insert(String word) {
        TrieNode current = root;
        for(char c : word.toCharArray()){
            if(!current.children.containsKey(c)){
                current.children.put(c, new TrieNode());
            }
            current = current.children.get(c);
        }
        current.isEnd = true;
    }

    //method for searching a new word
    public boolean search(String word) {
        TrieNode current = root;
        for(char c : word.toCharArray()){
            if(current.children.containsKey(c)){
                current = current.children.get(c);
            } else{
                return false;
            }
        }
        return current.isEnd;
    }

    //method to check if a prefix exists
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for(char c : prefix.toCharArray()){
            if(current.children.containsKey(c)){
                current = current.children.get(c);
            } else{
                return false;
            }
        }
        return true;
    }
}

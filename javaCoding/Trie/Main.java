package Trie;

public class Main {
    public static void main(String[] args) {
         Trie trie = new Trie();
         trie.insert("API");
         trie.insert("APPI");
         trie.insert("APIS");
         trie.Search("APP");
         trie.Search("apis");

    }
   
    
}

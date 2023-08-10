package Trie;


public class Trie {
    private TrieNode root;

    public Trie(){
        root = new TrieNode();
        System.out.println("Trie has been created!");
    }

    public void insert(String word){
        TrieNode currNode  = root;
        for(int i =0; i<word.length(); i++){
            char ch = word.charAt(i); 
            TrieNode node  = currNode.children.get(ch);
            if(node==null){
                node = new TrieNode();
                currNode.children.put(ch, node);
            }
            currNode = node;
        }
        currNode.endOfString = true;
        System.out.println("Successfully inserted "+word+" in Trie");
    }
}

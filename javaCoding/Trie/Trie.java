package Trie;


public class Trie {
    private TrieNode root;

    public Trie(){
        root = new TrieNode();
        System.out.println("Trie has been created!");
    }

    public void insert(String word){
         word = word.toLowerCase();
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

    //Search

    public boolean Search(String word){
        word = word.toLowerCase();  // Convert the input word to lowercase
        TrieNode currNode = root;
        for(int i =0; i<word.length(); i++){
            char ch = word.charAt(i);
            
            TrieNode node = currNode.children.get(ch);
            if(node==null){
                System.out.println("Word "+word+" does not exist in Trie");
                return false;
            }
            currNode = node;
        }
        if(currNode.endOfString == true){
            System.out.println("Word "+word+" exists in Trie");
            return true;
        }
        else{
            System.out.println("Word "+word+" does not exist in Trie, but it is a prefix of another string");
        }
        return currNode.endOfString;
    }
    
}

public class TrieNode{
    TrieNode[] child = new TrieNode[26];
    boolean eow = false;
}

public class PrefixTree {
    private TrieNode root;

    public PrefixTree(){
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode curr = root;

        for(int level = 0; level < word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.child[idx] == null){
                curr.child[idx] = new TrieNode();
            }
            curr = curr.child[idx];
        }
        curr.eow = true;
    }

    public boolean search(String word) {
        TrieNode curr = root;

        for(int level = 0; level < word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.child[idx] == null){
                return false;
            }
            curr = curr.child[idx];
        }
        return curr.eow == true;
    }

    public boolean startsWith(String prefix) {
        TrieNode curr = root;

        for(int level = 0; level < prefix.length(); level++){
            int idx = prefix.charAt(level) - 'a';
            if(curr.child[idx] == null){
                return false;
            }
            curr = curr.child[idx];
        }
        return true;
    }
}

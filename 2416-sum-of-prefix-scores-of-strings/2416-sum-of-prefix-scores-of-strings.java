/*class Solution {
    public int[] sumPrefixScores(String[] words) {
        Map<String,Integer> map=new HashMap<>();
        for(String i:words){
            int ind=0;
            while(ind<i.length()){
                String st=i.substring(0,ind+1);
                map.put(st,map.getOrDefault(st,0)+1);
                ind++;
            }
        }
        int[] res=new int[words.length];
        int ind=0;
        for(String i:words){
            int j=0;
            while(j<i.length()){
                String st=i.substring(0,j+1);
                res[ind]+=map.get(st);
                j++;
            }
            ind++;
        }
        return res;
    }
}*/
import java.util.*;

class Solution {
    // Define the Trie Node
    class TrieNode {
        int count;
        TrieNode[] children;

        TrieNode() {
            count = 0;
            children = new TrieNode[26]; // Assuming only lowercase letters a-z
        }
    }

    // Insert a word into the Trie and update counts
    private void insert(TrieNode root, String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (node.children[idx] == null) {
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx];
            node.count += 1; // Increment the count for this prefix
        }
    }

    // Calculate the prefix score for a word by traversing the Trie
    private int calculateScore(TrieNode root, String word) {
        TrieNode node = root;
        int score = 0;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (node.children[idx] == null) {
                break; // No further prefixes
            }
            node = node.children[idx];
            score += node.count;
        }
        return score;
    }

    public int[] sumPrefixScores(String[] words) {
        TrieNode root = new TrieNode();

        // Step 1: Insert all prefixes into the Trie
        for (String word : words) {
            insert(root, word);
        }

        // Step 2: Calculate prefix scores for each word
        int[] res = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            res[i] = calculateScore(root, words[i]);
        }

        return res;
    }
}

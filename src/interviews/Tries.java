package interviews;

import java.util.HashMap;
import java.util.Map;

public class Tries {
    public static void main(String[] args) {
        TrieNode root = new TrieNode();

        root.putWord(root, "hello");
        root.putWord(root, "he");

        root.putWord(root, "man");
        root.putWord(root, "many");

        System.out.println("ma is prefix? " + root.isWordAPrefix("ma"));
        System.out.println("he is prefix? " + root.isWordAPrefix("he"));
        System.out.println("an is prefix? " + root.isWordAPrefix("an"));

        System.out.println(root);

    }
}

class TrieNode {
    private char val;

    private boolean terminating;
    private Map<Character, TrieNode> children;

    public static final TrieNode TERMINATOR = new TrieNode('*');
    static {
        TERMINATOR.terminating = true;
    }

    public TrieNode(char val) {
        this.val = val;
        terminating = false;
        children = new HashMap<>();
    }

    public TrieNode() {
        this.val = 0;
        terminating = false;
        children = new HashMap<>();
    }

    @Override
    public String toString() {
        return "TrieNode{" +
                "val=" + val +
                ", terminating=" + terminating +
                ", " + children +
                '}';
    }

    public char getVal() {
        return val;
    }

    public void setVal(char val) {
        this.val = val;
    }

    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    public void putWord(TrieNode node, String word) {
        if(word.isEmpty()) {
            node.putChild(TERMINATOR);
            return;
        }
        TrieNode child = new TrieNode(word.charAt(0));
        child = node.putChild(child);
        putWord(child, word.substring(1));
    }

    public TrieNode putChild(TrieNode child) {
        if(children.containsKey(child.getVal())) {
            return children.get(child.getVal());
        }
        this.children.put(child.getVal(), child);
        return child;
    }

    public boolean isWordAPrefix(String word) {
        TrieNode node = this;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(!node.children.containsKey(c)) {
                return false;
            }
            node = node.children.get(c);
        }
        return true;
    }
}

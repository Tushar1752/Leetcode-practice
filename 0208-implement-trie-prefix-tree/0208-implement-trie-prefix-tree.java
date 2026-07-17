class Trie {

    Trie[] child = new Trie[26];
    boolean end;

    public Trie() {
    }

    public void insert(String word) {
        Trie node = this;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (node.child[i] == null)
                node.child[i] = new Trie();
            node = node.child[i];
        }
        node.end = true;
    }

    public boolean search(String word) {
        Trie node = find(word);
        return node != null && node.end;
    }

    public boolean startsWith(String prefix) {
        return find(prefix) != null;
    }

    private Trie find(String s) {
        Trie node = this;
        for (char c : s.toCharArray()) {
            int i = c - 'a';
            if (node.child[i] == null)
                return null;
            node = node.child[i];
        }
        return node;
    }
}
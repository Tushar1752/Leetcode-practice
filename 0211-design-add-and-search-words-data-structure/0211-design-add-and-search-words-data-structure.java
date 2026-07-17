class TrieNode {
    TrieNode[] child = new TrieNode[26];
    boolean end;
}

class WordDictionary {

    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {

        TrieNode node = root;

        for (char c : word.toCharArray()) {

            int i = c - 'a';

            if (node.child[i] == null)
                node.child[i] = new TrieNode();

            node = node.child[i];
        }

        node.end = true;
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    boolean dfs(String word, int i, TrieNode node) {

        if (node == null)
            return false;

        if (i == word.length())
            return node.end;

        char c = word.charAt(i);

        if (c == '.') {

            for (TrieNode next : node.child)
                if (dfs(word, i + 1, next))
                    return true;

            return false;
        }

        return dfs(word, i + 1, node.child[c - 'a']);
    }
}
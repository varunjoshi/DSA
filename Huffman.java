import java.util.PriorityQueue;

class HuffmanNode {
    int item;
    char c;
    HuffmanNode left;
    HuffmanNode right;
}

public class Huffman {

    public static void printCode(HuffmanNode root, String s) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null && Character.isLetter(root.c)) {
            System.out.println(root.c + "   |  " + s);
            return;
        }

        if (root.left != null) {
            printCode(root.left, s + "0");
        }

        if (root.right != null) {
            printCode(root.right, s + "1");
        }
    }

    public static void main(String[] args) {
        char[] charArray = { 'A', 'B', 'C', 'D' };
        int[] charfreq = { 5, 1, 6, 3 };
        int n = charArray.length;

        if (n == 0) {
            System.out.println("No characters to compress.");
            return;
        }

        PriorityQueue<HuffmanNode> q = new PriorityQueue<>((a, b) -> a.item - b.item);

        for (int i = 0; i < n; i++) {
            HuffmanNode hn = new HuffmanNode();
            hn.c = charArray[i];
            hn.item = charfreq[i];
            hn.left = null;
            hn.right = null;
            q.add(hn);
        }

        HuffmanNode root = null;

        while (q.size() > 1) {
            HuffmanNode x = q.peek();
            q.poll();

            HuffmanNode y = q.peek();
            q.poll();

            HuffmanNode f = new HuffmanNode();
            f.item = x.item + y.item;
            f.c = '-';
            f.left = x;
            f.right = y;
            root = f;

            q.add(f);
        }

        if (q.size() == 1) {
            root = q.peek();
        }

        printCode(root, "");
    }
}
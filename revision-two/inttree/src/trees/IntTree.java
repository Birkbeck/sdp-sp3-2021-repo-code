package trees;

public class IntTree {
    private final IntTreeNode overallRoot;

    // <methods>
    public IntTree(IntTreeNode top) {
        overallRoot = top;
    }

    @Override
    public String toString() {
        return traverse(overallRoot);
    }

    private String traverse(IntTreeNode t) {
        if (t == null) return "empty";
        if (t.left() == null && t.right() == null) return "" + t.data();
        return "(" + t.data() + ", " + traverse(t.left()) + ", " + traverse(t.right()) + ")";
    }
}
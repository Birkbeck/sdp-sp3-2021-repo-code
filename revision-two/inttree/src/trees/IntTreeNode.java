package trees;

public record IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
    public IntTreeNode(int data) {
        this(data, null, null);
    }

    @Override
    public String toString() {
        return "[" + data + "]";
    }
}
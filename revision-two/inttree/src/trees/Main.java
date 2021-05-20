package trees;

public class Main {
    public static void main(String[] args) {
        var t = new IntTree(
            new IntTreeNode(2,
                new IntTreeNode(8,
                    new IntTreeNode(0),
                    null),
                new IntTreeNode(1,
                    new IntTreeNode(7,
                        new IntTreeNode(4),
                        null),
                    new IntTreeNode(6,
                        null,
                        new IntTreeNode(9))
                )
            )
        );
        System.out.println(t);
    }
}

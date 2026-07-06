/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfsSerialize(root, sb);
        return sb.toString();
    }

    private void dfsSerialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("N,");
            return;
        }

        sb.append(root.val).append(",");
        dfsSerialize(root.left, sb);
        dfsSerialize(root.right, sb);
    }

    // Decodes your encoded data to tree.
    int index = 0;

    public TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        index = 0;
        return dfsDeserialize(nodes);
    }

    private TreeNode dfsDeserialize(String[] nodes) {
        if (nodes[index].equals("N")) {
            index++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(nodes[index]));
        index++;

        root.left = dfsDeserialize(nodes);
        root.right = dfsDeserialize(nodes);

        return root;
    }
}
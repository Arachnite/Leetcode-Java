
package P0144_BinaryTreePreorderTraversal;

import java.util.List;
import java.util.ArrayList;

public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<Integer>();
        preorder(root, result);
        return result;

    }

    public void preorder(TreeNode node, List<Integer> result) {

        if (node == null) {

            return;

        }

        result.add(node.val);
        preorder(node.left, result);
        preorder(node.right, result);
    }
}

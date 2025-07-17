/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        //Check if root is null
        if(root == null)
        {
            return new ArrayList<>();
        }

        List<List<Integer>> answer = new ArrayList<>();
        Deque<TreeNode> dq = new ArrayDeque<>(List.of(root));
        boolean isLeftToRight = true;

        while(!dq.isEmpty())
        {
            List<Integer> currLevel = new ArrayList<>();
            for(int s = dq.size(); s > 0; --s)
            {
                if(isLeftToRight)
                {
                    TreeNode node = dq.pollFirst();
                    currLevel.add(node.val);

                    if(node.left != null)
                    dq.offerLast(node.left);
                    if(node.right != null)
                    dq.offerLast(node.right);
                }
                else
                {
                    TreeNode node = dq.pollLast();
                    currLevel.add(node.val);

                    if(node.right != null)
                    dq.offerFirst(node.right);
                    if(node.left != null)
                    dq.offerFirst(node.left);
                }
            }
            answer.add(currLevel);
            isLeftToRight = !isLeftToRight;
        }
        return answer;
    }
}

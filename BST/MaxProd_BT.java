import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    long total = 0, best = 0;
    static final int MOD = 1_000_000_007;
    long sum(TreeNode node) {
        if (node == null) return 0;
        return node.val + sum(node.left) + sum(node.right);
    }
    long dfs(TreeNode node) {
        if (node == null) return 0;
        long s = node.val + dfs(node.left) + dfs(node.right);
        best = Math.max(best, s * (total - s));
        return s;
    }
    public int maxProduct(TreeNode root) {
        total = sum(root);
        dfs(root);
        return (int)(best % MOD);
    }
}
public class Main {
    public static TreeNode build(Integer[] arr) {
        if (arr.length == 0 || arr[0] == null) return null;
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(arr[0]);
        q.add(root);
        int i = 1;

        while (!q.isEmpty() && i < arr.length) {
            TreeNode curr = q.poll();
            if (i < arr.length && arr[i] != null) {
                curr.left = new TreeNode(arr[i]);
                q.add(curr.left);
            }
            i++;
            if (i < arr.length && arr[i] != null) {
                curr.right = new TreeNode(arr[i]);
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
    public static void main(String[] args) {
        Integer[] arr = {1,null,2,3,4,null,null,5,6};
        TreeNode root = build(arr);
        Solution sol = new Solution();
        int result = sol.maxProduct(root);
        System.out.println("Maximum Product = " + result);
    }
}

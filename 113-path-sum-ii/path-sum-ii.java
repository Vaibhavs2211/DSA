class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public void fun(TreeNode root, int target, int sum, List<Integer> diary) {

        if (root == null) {
            return;
        }

        sum += root.val;
        diary.add(root.val);

        // Leaf node
        if (root.left == null && root.right == null) {

            if (sum == target) {
                ans.add(new ArrayList<>(diary));
            }

            diary.remove(diary.size() - 1);
            return;
        }

        fun(root.left, target, sum, diary);
        fun(root.right, target, sum, diary);

        diary.remove(diary.size() - 1); // backtracking
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        fun(root, targetSum, 0, new ArrayList<>());
        return ans;
    }
}
package DFS;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _40 {
    @Test
    public void test() {
        int[] nums = {2, 5, 2, 1, 2, 3, 4};
        int target = 5;
        System.out.print(combinationSum2(nums, target));
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        dfs(candidates, res, temp, 0, target);
        return res;
    }

    public void dfs(int[] condidates, List<List<Integer>> res, ArrayList<Integer> temp, int start, int target) {
        if (target < 0)
            return;
        if (target == 0) {
            if (!res.contains(temp)) {
                res.add(new ArrayList<>(temp));
            }
            return;
        }
        for (int i = start; i < condidates.length; i++) {
            if (i > start && condidates[i] == condidates[i - 1])
                continue;
            temp.add(condidates[i]);
            dfs(condidates, res, temp, i + 1, target - condidates[i]);
            if (temp.size() > 0)
                temp.remove(temp.size() - 1);
        }
    }
}

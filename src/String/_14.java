package String;

import org.junit.Test;

public class _14 {
    @Test
    public void Test() {
        String[] strs = {"flower", "flow", "floght"};
        System.out.println(longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        String s = "";

        if (strs.length == 0)
            return s;

        int len = strs.length;
        int maxlength = strs[0].length();
        for (int i = 1; i < len; i++) {
            int cnt = 0;
            for (int j = 0; j < Math.min(strs[i].length(), maxlength); j++) {
                if (strs[i - 1].charAt(j) != strs[i].charAt(j))
                    break;
                else {
                    cnt++;
                }

            }
            maxlength = Math.min(maxlength, cnt);
        }

        for (int i = 0; i < maxlength; i++) {
            s += strs[0].charAt(i);
        }
        return s;
    }
}

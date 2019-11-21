package ua.epam.homework4.common_subsequence;

class LongestCommonSubstring {
    public String getCommonSubstring(String string1, String string2) {
        int str1Length = string1.length();
        int str2Length = string2.length();

        int max = 0;

        int[][] dp = new int[str1Length][str2Length];
        int endIndex = -1;
        for (int i = 0; i < str1Length; i++) {
            for (int j = 0; j < str2Length; j++) {
                if (string1.charAt(i) == string2.charAt(j)) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                    if (max < dp[i][j]) {
                        max = dp[i][j];
                        endIndex = i;
                    }
                }
            }
        }
        return string1.substring(endIndex - max + 1, endIndex + 1);
    }
}

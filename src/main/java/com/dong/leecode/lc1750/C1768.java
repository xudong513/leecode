package com.dong.leecode.lc1750;

import java.util.Random;
import util.AssertUtils;
import util.StringUtils;

/**
 * 交替合并字符串
 *
 * @author xudong
 * @link https://leetcode-cn.com/problems/merge-strings-alternately/
 * @date Created in 2021/10/27 12:59
 */
public class C1768 {

    public static void main(String[] args) {
        Random random = new Random();
        // 校验器
        for (int i = 0; i < 100; i++) {
            String word1 = StringUtils.getRandomString(random.nextInt(100) + 1);
            String word2 = StringUtils.getRandomString(random.nextInt(100) + 1);
            AssertUtils.assertEquals(mergeAlternately1(word1, word2), mergeAlternately2(word1, word2));
        }
    }

    public static String mergeAlternately1(String word1, String word2) {
        int minLength = Math.min(word1.length(), word2.length());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            stringBuilder.append(word1.charAt(i));
            stringBuilder.append(word2.charAt(i));
        }
        String longerStr = word1.length() >= word2.length() ? word1 : word2;
        stringBuilder.append(longerStr.substring(minLength));
        return stringBuilder.toString();
    }

    public static String mergeAlternately2(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length(), idx = 0;
        char[] resultChars = new char[len1 + len2];
        for (int i = 0; i < len1 || i < len2; ++i) {
            if (i < len1) {
                resultChars[idx++] = word1.charAt(i);
            }
            if (i < len2) {
                resultChars[idx++] = word2.charAt(i);
            }
        }
        return new String(resultChars);
    }
}

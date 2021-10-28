package util;

import java.util.Random;

/**
 * 字符串工具类
 *
 * @author xudong
 * @date Created in 2021/10/27 13:03
 */
public class StringUtils {

    public static final String DEFAULT_RANDOM_CHAR_SET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";


    public static String getRandomString(int length) {
        return getRandomString(DEFAULT_RANDOM_CHAR_SET, length);
    }

    /**
     * 生成随机字符串
     *
     * @param charsStr 备选字符
     * @param length   字符串长度
     * @return java.lang.String 随机字符串
     */
    public static String getRandomString(String charsStr, int length) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(charsStr.length());
            stringBuilder.append(charsStr.charAt(number));
        }
        return stringBuilder.toString();
    }
}

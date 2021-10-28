package util;

import java.util.Objects;

/**
 * 字符串工具类
 *
 * @author xudong
 * @date Created in 2021/10/27 13:03
 */
public class AssertUtils {


    public static void assertEquals(Object expected, Object actual) {

        boolean equal = Objects.equals(expected, actual);
        if (!equal) {
            throw new RuntimeException("运行结果与期望值不一样");
        }
    }
}

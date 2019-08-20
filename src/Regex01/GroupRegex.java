package Regex01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式的分组处理
 */
public class GroupRegex {

    public static void main(String[] args) {
        //使用括号将其分组，后面可通过m.group(num)取到
        Pattern p = Pattern.compile("([a-z]+)(\\d+)");

        Matcher m = p.matcher("a123bb234ccc444");
        while (m.find()) {
            System.out.println(m.group(0));
            System.out.println(m.group(1));
            System.out.println(m.group(2));
        }
    }
}

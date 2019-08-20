package Regex01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式的替换
 */
public class ReplaceRegex {

    public static void main(String[] args) {

        Pattern p = Pattern.compile("[0-9]");

        Matcher m = p.matcher("a123bb234ccc444");

        String replaceAll = m.replaceAll("\\$");
        System.out.println(replaceAll);
    }
}

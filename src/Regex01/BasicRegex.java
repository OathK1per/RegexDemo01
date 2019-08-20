package Regex01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式的基本用法
 */
public class BasicRegex {

    public static void main(String[] args) {

        Pattern p = Pattern.compile("\\w+");

        Matcher m = p.matcher("abc12.32323.bj");
//        //需要match整个文本内容，则返回true，match之后无论返回什么，都会影响后面find的初始位置
//        boolean matches = m.matches();
//        System.out.println(matches);
        //查找匹配的下一个子序列
        boolean find = m.find();
        //输出目前的匹配序列
        System.out.println(find + "-->" + m.group());
        boolean find2 = m.find();
        System.out.println(find2 + "-->" + m.group());
        boolean find3 = m.find();
        System.out.println(find3);
        boolean find4 = m.find();
        System.out.println(find4);
//        while(m.find()) {
//            System.out.println(m.group());
//        }
    }
}

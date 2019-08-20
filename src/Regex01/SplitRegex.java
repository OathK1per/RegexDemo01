package Regex01;

/**
 * 字符串的分割
 */
public class SplitRegex {

    public static void main(String[] args) {
        String str = "a123b34cc456dd567";

        String[] split = str.split("[0-9]+");
        for (String s : split) {
            System.out.println(s);
        }
    }
}

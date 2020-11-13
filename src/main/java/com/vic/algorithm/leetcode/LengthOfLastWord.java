package com.vic.algorithm.leetcode;


/**
 *
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
 *
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/length-of-last-word
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 输入: "Hello World"
 * 输出: 5
 *
 * 'a ' = 1
 *
 * @author: wangqp
 * @create: 2020-08-12 14:34
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        StringBuilder sb = new StringBuilder();
        //找到最后一个字母的下标
        int last = s.length();

        for (int i=0;i<last;i++){
            if (s.charAt(i) == ' '){
                sb.setLength(0);
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.length();
    }
}
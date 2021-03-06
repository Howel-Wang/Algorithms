package cn.howel.chapter1.section1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

/**
 * 编写一段代码，将一个正整数 N 用二进制表示并转换为一个String类型的数值s
 * 解答：Java 有一个内置方法 Integer.toBinaryString(N) 专门完成这个任务，但该题的目的就 是给出这个方法的其他实现方法。下面就是一个特别简洁的答案：
 * String s = "";
 * for (int n = N; n > 0; n /= 2)
 * s = (n % 2) + s;
 *
 * @author howel
 */
public class Practice9 {
    public static void main(String[] args) {
        In in = new In();
        int N = in.readInt();
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        // Java内置的方法
        StdOut.println("Java内置方法：" + Integer.toBinaryString(N));
        StdOut.println(s);
    }
}

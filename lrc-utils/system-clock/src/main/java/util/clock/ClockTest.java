package util.clock;

import java.util.*;

public class ClockTest {
    public static void main(String[] args) {
        long n = 100000000;
        long m;

        Date d = new Date();
        for (int i = 0; i < n; i++) {
            System.currentTimeMillis();
        }
        Date d1 = new Date();
        m = d1.getTime() - d.getTime();
        System.out.println("1亿次耗时：" + m + "毫秒, 一次耗时：" + (float)m/(float)n + "毫秒");

        Date d2 = new Date();
        for (int i = 0; i < n; i++) {
            Object obj = new Object();
        }
        Date d3 = new Date();
        m = d3.getTime() - d2.getTime();
        System.out.println("1亿次耗时：" + m + "毫秒, 一次耗时：" + (float)m/(float)n + "毫秒");

        Date d4 = new Date();
        for (int i = 0; i < n; i++) {
            SystemClock.now();
        }
        Date d5 = new Date();
        m = d5.getTime() - d4.getTime();
        System.out.println("1亿次耗时：" + m + "毫秒, 一次耗时：" + (float)m/(float)n + "毫秒");
    }
}

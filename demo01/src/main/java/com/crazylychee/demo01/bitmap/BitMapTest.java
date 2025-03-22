package com.crazylychee.demo01.bitmap;

import org.roaringbitmap.RoaringBitmap;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class BitMapTest {


    public static void main(String[] args) {
        // 使用RoaringBitmap压缩存储（Java示例）
        RoaringBitmap bitmap = new RoaringBitmap();
        bitmap.add(100000L, 150000L); // 存储连续区间


        // 查询时快速定位
        int targetPos = 19980;
        int foundIndex = bitmap.select(targetPos); // O(1)时间复杂度
        System.out.println(foundIndex);
    }

}

package com.crazylychee.demo01.optional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class WithoutOptionalExample {
    public static void main(String[] args) {
        List<String> dataList = null; // 假设数据列表为null
        List<String> pageData = getPageData(dataList); // 这将抛出NullPointerException
        printData(pageData);
    }

    private static List<String> getPageData(List<String> dataList) {
        // 直接返回数据列表，没有进行null检查,将会抛出空指针异常
        //return dataList;
        // 使用Optional来避免空指针异常
        return Optional.ofNullable(dataList).orElse(Collections.emptyList());
    }

    private static void printData(List<String> data) {
        for (String item : data) {
            System.out.println(item);
        }
    }
}

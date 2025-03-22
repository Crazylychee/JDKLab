package com.crazylychee.demo01.function;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class FunctionalInterfacesDemo {
    public static void main(String[] args) throws Exception {
        // ================== Supplier：数据生成 ==================
        Supplier<List<String>> dataSupplier = () ->
                Arrays.asList("Apple", "", "Banana", "  ", "Cherry", "Date");

        List<String> rawData = dataSupplier.get();
        System.out.println("原始数据: " + rawData);

        // ================== Predicate：过滤非空字符串 ==================
        Predicate<String> isNotEmpty = s -> !s.trim().isEmpty();
        List<String> filteredData = rawData.stream()
                .filter(isNotEmpty)
                .collect(Collectors.toList());
        System.out.println("过滤后: " + filteredData);

        // ================== Function：转换操作 ==================
        Function<String, Integer> lengthMapper = String::length;
        List<Integer> lengths = filteredData.stream()
                .map(lengthMapper)
                .collect(Collectors.toList());
        System.out.println("长度映射: " + lengths);

        // ================== Consumer：消费数据 ==================
        Consumer<String> printConsumer = s ->
                System.out.println("[消费] " + s.toUpperCase());
        filteredData.forEach(printConsumer);

        // ================== Comparator：自定义排序 ==================
        Comparator<String> lengthComparator =
                (s1, s2) -> s1.length() - s2.length();
        List<String> sortedData = filteredData.stream()
                .sorted(lengthComparator)
                .collect(Collectors.toList());
        System.out.println("按长度排序: " + sortedData);

        // ================== Runnable & Callable：异步任务 ==================
        Runnable logTask = () ->
                System.out.println(Thread.currentThread().getName() + " - 日志任务完成");

        Callable<Integer> calculationTask = () -> {
            TimeUnit.MILLISECONDS.sleep(500);
            return filteredData.stream()
                    .mapToInt(String::length)
                    .sum();
        };

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(logTask);
        Future<Integer> future = executor.submit(calculationTask);

        System.out.println("异步计算结果: " + future.get());
        executor.shutdown();

        // ================== BiFunction：双参数计算 ==================
        BiFunction<Integer, Integer, Double> powerFunc =
                (base, exponent) -> Math.pow(base, exponent);
        System.out.println("2^5 = " + powerFunc.apply(2, 5));

        // ================== UnaryOperator：单一类型转换 ==================
        UnaryOperator<String> reverseOperator = s ->
                new StringBuilder(s).reverse().toString();
        System.out.println("反转Apple: " + reverseOperator.apply("Apple"));

        // ================== BinaryOperator：聚合操作 ==================
        BinaryOperator<Integer> maxOperator =
                Integer::max;
        int maxLength = lengths.stream()
                .reduce(maxOperator)
                .orElse(0);
        System.out.println("最大长度: " + maxLength);

        // ================== 组合用法示例 ==================
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Function<Integer, String> formatFunc = n ->
                String.format("数值: %d", n);

        lengths.stream()
                .filter(isEven.negate())  // 过滤奇数
                .map(formatFunc.andThen(s -> s + "!"))  // 拼接感叹号
                .forEach(System.out::println);  // 方法引用消费
    }
}

package com.crazylychee.demo01.string;

import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime) // 测量平均执行时间
@OutputTimeUnit(TimeUnit.MILLISECONDS) // 输出单位为毫秒
@Warmup(iterations = 3, time = 1) // 预热 3 轮，每轮 1 秒
@Measurement(iterations = 5, time = 1) // 正式测试 5 轮，每轮 1 秒
@Fork(1) // 启动 1 个 JVM 进程
@State(Scope.Thread) // 每个线程独立状态
public class StringConcatBenchmark {

    @Param({"100", "10000", "100000"}) // 测试量级：100、10,000、100,000次
    private int iterations;

    //------------------ 测试场景 1：直接使用 String 的 `+` 拼接 ------------------
    @Benchmark
    public String testStringConcat() {
        String s = "";
        for (int i = 0; i < iterations; i++) {
            s += i; // 低效操作：每次循环生成新对象
        }
        return s;
    }

    //------------------ 测试场景 2：正确使用 StringBuilder（循环外创建） ------------------
    @Benchmark
    public String testStringBuilderCorrect() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(i); // 高效操作：复用同一个对象
        }
        return sb.toString();
    }

    //------------------ 测试场景 3：错误使用 StringBuilder（循环内创建） ------------------
    @Benchmark
    public String testStringBuilderWrong() {
        String s = "";
        for (int i = 0; i < iterations; i++) {
            StringBuilder sb = new StringBuilder(); // 错误：频繁创建对象
            sb.append(s);
            sb.append(i);
            s = sb.toString();
        }
        return s;
    }

    //------------------ 测试场景 4：使用 StringBuffer（线程安全） ------------------
    @Benchmark
    public String testStringBuffer() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sb.append(i); // 线程安全但性能略低
        }
        return sb.toString();
    }
}

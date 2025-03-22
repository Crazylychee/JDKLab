package com.crazylychee.demo01;

import com.crazylychee.demo01.string.StringConcatBenchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * 基准测试类
 */
public class BenchmarkRunner {
    public static void main(String[] args) throws Exception {
        Options options = new OptionsBuilder()
                .include(StringConcatBenchmark.class.getSimpleName())
                .build();
        new Runner(options).run();

    }
}

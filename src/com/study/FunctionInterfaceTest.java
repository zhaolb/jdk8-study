package com.study;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Mtime
 * @date 2018/8/8.
 */
public class FunctionInterfaceTest {
    public void test(){
        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("我是消费型接口");

        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println("我是供给型接口,当前时间:" + supplier.get());

        Function<String,String> function = name -> "Hello," + name;
        String funResult = function.apply("我是函数型接口");
        System.out.println(funResult);

        Predicate<Integer> predicate = num -> num > 0;
        boolean testResult = predicate.test(10);
        System.out.println(testResult);
    }

    public static void main(String[] args) {
        new FunctionInterfaceTest().test();
    }
}

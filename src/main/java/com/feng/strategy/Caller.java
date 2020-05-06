package com.feng.strategy;

/**
 * Caller
 * 调用者
 * @author feng
 * @date 2020/5/2 16:24
 */
public class Caller {
    public static void main(String[] args) {

        Context context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();
    }
}

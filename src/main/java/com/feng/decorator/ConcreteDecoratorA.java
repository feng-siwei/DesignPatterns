package com.feng.decorator;

/**
 * ConcreteDecoratorA
 * 具体装饰类A
 * @author feng
 * @date 2020/5/3 12:04
 */
public class ConcreteDecoratorA extends Decorator {
    /**
     * 本类的特有功能,以区别ConcreteDecoratorB
     */
    private String addedState;

    /**
     * 首先运行原Component的operation()方法,再执行本类的功能,如addedState，
     * 相当于对原本Component类进行了装饰
     */
    @Override
    public void operation() {
        super.operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");

    }
}

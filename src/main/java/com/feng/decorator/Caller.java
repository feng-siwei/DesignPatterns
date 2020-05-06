package com.feng.decorator;

/**
 * Caller
 * 调用者
 * @author feng
 * @date 2020/5/2 16:24
 */
public class Caller {
    public static void main(String[] args) {
        ComponentComponent c = new ComponentComponent();
        Decorator a = new ConcreteDecoratorA();
        Decorator b = new ConcreteDecoratorB();

        //a来包装c,b来包装a
        a.setComponent(c);
        b.setComponent(a);

        //最终执行b的operation()方法
        b.operation();

    }
}

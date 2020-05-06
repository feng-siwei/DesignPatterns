package com.feng.decorator;

/**
 * ConcreteDecoratorB
 * 具体装饰类B
 * @author feng
 * @date 2020/5/3 12:04
 */
public class ConcreteDecoratorB extends Decorator {

    /**
     * 首先运行原Component的operation()方法,再执行本类的功能,如addedState，
     * 相当于对原本Component类进行了装饰
     */
    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");

    }

    /**
     * 本类特有的一种方法,以区别与其他装饰类
     */
    private void addedBehavior(){
        System.out.println("这是一段装饰类B特有的一段方法");
    }
}

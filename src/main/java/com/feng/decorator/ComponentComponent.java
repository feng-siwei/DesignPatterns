package com.feng.decorator;

/**
 * ComponentComponent
 * 一个具体的对象,通过装饰模式,我们可以为这个对象添加一些职责.具体添加到从component上继承的方法下
 * @author feng
 * @date 2020/5/3 11:53
 */
public class ComponentComponent implements Component{
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}

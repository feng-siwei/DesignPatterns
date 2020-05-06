package com.feng.decorator;

/**
 * Decorator
 * 装饰器
 *
 * @author feng
 * @date 2020/5/3 11:57
 */
public class Decorator implements Component {

    private Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * 重写operation方法
     */
    @Override
    public void operation() {
            if (component != null){
                component.operation();
            }
    }
}

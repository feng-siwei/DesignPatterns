package com.feng.strategy;

/**
 * 策略模式 - 上下文
 * @author feng3
 */
public class Context {
    private Strategy strategy;


    /**
     * 构造方法直接将算法类注入
     * @param strategy 具体算法类
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }


    /**
     * 根据具体测试对象调用其算法对象
     */
    public void contextInterface(){
        strategy.algorithmInterface();
    }

}

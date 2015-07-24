package com.hxy.aop;
/**
 * 中华田园犬
 * @author hxy
 *
 */
public class ChineseDog implements Dog {

    @Override
    public void shout(String name) {
        System.out.println("中华田园犬"+name+" 叫了一声");
    }

    @Override
    public void sleep(String name) {
        System.out.println("中华田园犬"+name+" 睡着了");
    }
    public void error() throws Exception {
        throw new Exception("shout exception");
    }
}

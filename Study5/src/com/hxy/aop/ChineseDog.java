package com.hxy.aop;
/**
 * �л���԰Ȯ
 * @author hxy
 *
 */
public class ChineseDog implements Dog {

    @Override
    public void shout(String name) {
        System.out.println("�л���԰Ȯ"+name+" ����һ��");
    }

    @Override
    public void sleep(String name) {
        System.out.println("�л���԰Ȯ"+name+" ˯����");
    }
    public void error() throws Exception {
        throw new Exception("shout exception");
    }
}

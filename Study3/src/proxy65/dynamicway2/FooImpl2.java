package proxy65.dynamicway2;

/**
 * 被代理的类2
 * @author hxy
 *
 */
public class FooImpl2 implements Foo {

	@Override
	public void doAction() {
		System.out.println("in FooImpl2 doAction!");
	}

}

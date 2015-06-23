package proxy65.dynamicway2;

/**
 * 被代理的类1
 * @author hxy
 *
 */
public class FooImpl implements Foo {

	@Override
	public void doAction() {
		System.out.println("in FooImpl doAction!");
	}

}

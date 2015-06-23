package Annotation69.myRetention;

@MyAnnotation(hello = "beijing", world = "shanghai")
public class MyTest
{
	@MyAnnotation(hello = "tianjing", world = "shangdi")
	@Deprecated
	@SuppressWarnings("unchecked")
	public void output()
	{
		System.out.println("output something");
	}
}

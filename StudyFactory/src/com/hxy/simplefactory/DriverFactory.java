package com.hxy.simplefactory;

/**
 * 工厂类角色
 * 
 * @author hxy
 * 
 */
public class DriverFactory
{
	/**
	 * 
	 * @param s 告诉工厂需要生产什么样的对象（开什么车）
	 * @return	具体的产品角色给客户端
	 * @throws Exception
	 */
	public static Car driverCar(String s) throws Exception
	{
		if("Benz".equals(s))
		{
			return new Benz();
		}
		else if ("Bmw".equals(s))
		{
			return new Bmw();
		}
		else
		{
			throw new Exception();
		}
	}
	
	public static void main(String[] args)
	{
		try
		{
			Car car = DriverFactory.driverCar("Benz");
			
			car.drive();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

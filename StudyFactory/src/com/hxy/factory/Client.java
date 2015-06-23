package com.hxy.factory;

/**
 * 工厂方法模式，即把工厂类也设置为可以继承的。分类处理。模块化。
 * @author hxy
 *
 */
public class Client
{
	public static void main(String[] args)
	{
		try
		{
			Driver driver = new BenzDriver();
			
			Car car = driver.driverCar();
			
			car.drive();
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}

/**
 * 工厂类基类
 * @author hxy
 *
 */
interface Driver
{
	public Car driverCar();
}

/**
 * 子类工厂
 * @author hxy
 *
 */
class BenzDriver implements Driver
{
	public Car driverCar()
	{
		return new Benz();
	}
}

/**
 * 子类工厂
 * @author hxy
 *
 */
class BmwDriver implements Driver
{
	public Car driverCar()
	{
		return new Bmw();
	}
}
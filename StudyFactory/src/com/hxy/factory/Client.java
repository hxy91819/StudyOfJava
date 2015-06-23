package com.hxy.factory;

/**
 * ��������ģʽ�����ѹ�����Ҳ����Ϊ���Լ̳еġ����ദ��ģ�黯��
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
 * ���������
 * @author hxy
 *
 */
interface Driver
{
	public Car driverCar();
}

/**
 * ���๤��
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
 * ���๤��
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
package com.hxy.simplefactory;

/**
 * �������ɫ
 * 
 * @author hxy
 * 
 */
public class DriverFactory
{
	/**
	 * 
	 * @param s ���߹�����Ҫ����ʲô���Ķ��󣨿�ʲô����
	 * @return	����Ĳ�Ʒ��ɫ���ͻ���
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

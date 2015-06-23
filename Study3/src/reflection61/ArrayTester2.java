package reflection61;

import java.lang.reflect.Array;

public class ArrayTester2 {
	public static void main(String[] args) {
		int[] dims = new int[] { 5, 10, 15 };

		// 维度，创建一个长宽高为dims的三维数组
		Object arrayObject = Array.newInstance(Integer.TYPE, dims);
		// 等同于上面的数组维度写法
//		Object arrayObject = Array.newInstance(Integer.TYPE, 5,10,15);

		System.out.println(arrayObject instanceof int[][][]);
		
		// 这是一个二维数组，取三维数组的3号位
		Object arrayObject2 = Array.get(arrayObject, 3);

		Class<?> classType = arrayObject.getClass().getComponentType();// 返回元素的类型

//		System.out.println(classType);
		
		// 又成了一维数组，取二维数组的5号位
		arrayObject2 = Array.get(arrayObject2, 5);

		// 在以为数组的10位置赋37。
		Array.setInt(arrayObject2, 10, 37);

		int[][][] arrayCast = (int[][][]) arrayObject;

		System.out.println(arrayCast[3][5][10]);
	}
}

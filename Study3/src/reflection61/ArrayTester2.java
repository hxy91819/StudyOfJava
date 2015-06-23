package reflection61;

import java.lang.reflect.Array;

public class ArrayTester2 {
	public static void main(String[] args) {
		int[] dims = new int[] { 5, 10, 15 };

		// ά�ȣ�����һ�������Ϊdims����ά����
		Object arrayObject = Array.newInstance(Integer.TYPE, dims);
		// ��ͬ�����������ά��д��
//		Object arrayObject = Array.newInstance(Integer.TYPE, 5,10,15);

		System.out.println(arrayObject instanceof int[][][]);
		
		// ����һ����ά���飬ȡ��ά�����3��λ
		Object arrayObject2 = Array.get(arrayObject, 3);

		Class<?> classType = arrayObject.getClass().getComponentType();// ����Ԫ�ص�����

//		System.out.println(classType);
		
		// �ֳ���һά���飬ȡ��ά�����5��λ
		arrayObject2 = Array.get(arrayObject2, 5);

		// ����Ϊ�����10λ�ø�37��
		Array.setInt(arrayObject2, 10, 37);

		int[][][] arrayCast = (int[][][]) arrayObject;

		System.out.println(arrayCast[3][5][10]);
	}
}

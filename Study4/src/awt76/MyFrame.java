package awt76;

import java.awt.Color;
import java.awt.Frame;

/**
 * �򵥵Ĵ���
 * @author hxy
 *
 */
public class MyFrame extends Frame {
	public MyFrame(String title){
		super(title);//����
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame("�ҵ�GUI����");
		
		frame.setSize(500, 500);//���ó���
		
		frame.setBackground(Color.PINK);//���ñ���ɫ
		
		frame.setVisible(true);//��������Ϊ�ɼ����У�������ã�
	}
}

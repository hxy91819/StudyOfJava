package awt76;

import java.awt.Color;
import java.awt.Frame;

/**
 * 简单的窗体
 * @author hxy
 *
 */
public class MyFrame extends Frame {
	public MyFrame(String title){
		super(title);//标题
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame("我的GUI程序");
		
		frame.setSize(500, 500);//设置长宽
		
		frame.setBackground(Color.PINK);//设置背景色
		
		frame.setVisible(true);//必须设置为可见才行（最后设置）
	}
}

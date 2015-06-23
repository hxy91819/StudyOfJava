package awt76;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 * 流式布局测试
 * 尝试拖动放大缩小窗体，查看这种布局的特点
 * @author hxy
 *
 */
public class GUIFlowLayout
{
	private Frame frame;
	
	private Button button1, button2, button3;
	
	public void go()
	{
		frame = new Frame("Flow Layout");
		
		//使用FlowLayout替换掉默认的BorderLayout布局管理器
		frame.setLayout(new FlowLayout()); 
		
		button1 = new Button("hello");
		button2 = new Button("world");
		button3 = new Button("welcome");
		
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		
		frame.setSize(100,100);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args)
	{
		GUIFlowLayout flow = new GUIFlowLayout();
		
		flow.go();
	}
	
	
	
	
	
	
	
	
	
	
	
}

package awt76;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/**
 * 了解布局
 * @author hxy
 *
 */
public class GUILayOut
{
	private Frame frame;
	
	private Button button1;
	
	private Button button2;
	
	public void go()
	{
		frame = new Frame("gui example");
		
		frame.setLayout(new FlowLayout());//设置为流式布局（常规布局）
		//注释掉上面的一行代码，则Frame使用自己的BorderLayOut来布局。
		
		button1 = new Button("Press me");
		button2 = new Button("Don't press me");
		
		frame.add(button1);
		frame.add(button2);
		
		frame.pack();
		frame.setVisible(true);	
	}
	
	public static void main(String[] args)
	{
		GUILayOut window = new GUILayOut();
		window.go();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

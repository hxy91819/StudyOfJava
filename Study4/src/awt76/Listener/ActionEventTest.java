package awt76.Listener;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 事件
 * @author hxy
 *
 */
public class ActionEventTest
{
	public static void main(String[] args)
	{
		Frame frame = new Frame("Test Button");
		
		Button button = new Button("Press Me!");
		
		//增加事件处理器
		button.addActionListener(new ButtonHandler());
		
		frame.add(button,BorderLayout.CENTER);
		
		frame.pack();
		
		frame.setVisible(true);
		
	}
}

class ButtonHandler implements ActionListener{
	//有事件发生的时候将自动调用
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button has been pressed!");
		
		String label = e.getActionCommand();//对于按钮来说，就是返回Button的标签。
		
		System.out.println(label);
	}
}






















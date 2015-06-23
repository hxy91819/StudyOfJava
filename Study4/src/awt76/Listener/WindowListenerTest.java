package awt76.Listener;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Date;

/**
 * 窗口事件监听器
 * @author hxy
 *
 */
public class WindowListenerTest
{
	public static void main(String[] args)
	{
		Frame frame = new Frame("My Frame2");
		
		Button button = new Button("click me");
		
		button.addActionListener(new MyListener());//注册监听事件
		
		frame.addWindowListener(new MyWindowListener());//注册窗口的监听事件
		
		frame.add(button);
		
		frame.setSize(500,500);
		
		frame.setVisible(true);
	}
}

class MyListener implements ActionListener
{
	@Override
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e)
	{
		long milliSeconds = e.getWhen();
		
		Date date = new Date(milliSeconds);
		
		System.out.println(date.toLocaleString());
	}
}

/**
 * 窗口事件监听器
 * 执行窗口内的一切操作都会调用相应的方法
 * @author hxy
 *
 */
class MyWindowListener implements WindowListener
{

	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	public void windowClosing(WindowEvent e)
	{
		System.out.println("关闭窗口");
		System.exit(0);
	}

	public void windowClosed(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	public void windowIconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	public void windowDeiconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	public void windowActivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	public void windowDeactivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	
}























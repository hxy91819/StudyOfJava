package awt76.Listener;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * 两个监听器的测试
 * 多个监听器都会触发
 * @author hxy
 *
 */
public class TwoListenerTest implements MouseMotionListener, MouseListener
{
	private Frame frame;
	
	private TextField textField;//文本框
	
	@Override
	public void mouseClicked(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		String str = "The mouse has entered the Frame";
		
		this.textField.setText(str);
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		String str = "The mouse has left the Frame";
		
		this.textField.setText(str);
	}
	/**
	 * 拖动
	 */
	@Override
	public void mouseDragged(MouseEvent e)
	{
		//获取坐标
		String str = "x: " + e.getX() + ", y: " + e.getY();
		
		this.textField.setText(str);
	}

	@Override
	public void mouseMoved(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	public void go()
	{
		frame = new Frame("Two Listeners Example");
		
		frame.add(new Label("click"), BorderLayout.NORTH);
		
		textField = new TextField(30);//文本框长度为30
		
		frame.add(textField, BorderLayout.SOUTH);
		
		frame.addMouseMotionListener(this);
		frame.addMouseListener(this);//绑定第一个事件监听器（自身）
		
		frame.addMouseListener(new MyMouseListener());//添加第二个事件监听器
		
		frame.addWindowListener(new MyWindowListener());//注册窗口的监听事件
		
		//两个事件监听器都会触发
		
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		TwoListenerTest two = new TwoListenerTest();
		
		two.go();
	}
	
}

class MyMouseListener implements MouseListener
{

	@Override
	public void mouseClicked(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		String str = "The mouse has entered the Frame";
		
		System.out.println(str);
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		String str = "The mouse has exited the Frame";
		
		System.out.println(str);
		
	}
	
}














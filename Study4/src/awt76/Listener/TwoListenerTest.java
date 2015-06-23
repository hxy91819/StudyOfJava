package awt76.Listener;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * �����������Ĳ���
 * ������������ᴥ��
 * @author hxy
 *
 */
public class TwoListenerTest implements MouseMotionListener, MouseListener
{
	private Frame frame;
	
	private TextField textField;//�ı���
	
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
	 * �϶�
	 */
	@Override
	public void mouseDragged(MouseEvent e)
	{
		//��ȡ����
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
		
		textField = new TextField(30);//�ı��򳤶�Ϊ30
		
		frame.add(textField, BorderLayout.SOUTH);
		
		frame.addMouseMotionListener(this);
		frame.addMouseListener(this);//�󶨵�һ���¼�������������
		
		frame.addMouseListener(new MyMouseListener());//��ӵڶ����¼�������
		
		frame.addWindowListener(new MyWindowListener());//ע�ᴰ�ڵļ����¼�
		
		//�����¼����������ᴥ��
		
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














package awt76.Listener;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Date;

/**
 * �����¼�������
 * @author hxy
 *
 */
public class WindowListenerTest
{
	public static void main(String[] args)
	{
		Frame frame = new Frame("My Frame2");
		
		Button button = new Button("click me");
		
		button.addActionListener(new MyListener());//ע������¼�
		
		frame.addWindowListener(new MyWindowListener());//ע�ᴰ�ڵļ����¼�
		
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
 * �����¼�������
 * ִ�д����ڵ�һ�в������������Ӧ�ķ���
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
		System.out.println("�رմ���");
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























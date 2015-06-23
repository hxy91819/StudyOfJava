package awt76.Listener;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * ������
 * Ϊ�˼򻯣�ֻ����ʹ����Ҫ���õķ���
 * MouseAdapter��һ���࣬���Բ���Ҫʵ�����еķ�������MouseMotionListener�ǽӿڣ�����ʵ�����еķ���
 * @author hxy
 *
 */
public class TwoListenerAdapterTest
{
	private Frame frame;

	private TextField textField;

	public void go()
	{
		frame = new Frame("Two Listeners Example");

		frame.add(new Label("click"), BorderLayout.NORTH);

		textField = new TextField(30);

		frame.add(textField, BorderLayout.SOUTH);
		
		frame.addMouseListener(new MyAdapter());
		
		frame.setSize(300, 200);
		frame.setVisible(true);

	}
	
	public static void main(String[] args)
	{
		TwoListenerAdapterTest two = new TwoListenerAdapterTest();
		
		two.go();
	}
}

class MyAdapter extends MouseAdapter
{
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

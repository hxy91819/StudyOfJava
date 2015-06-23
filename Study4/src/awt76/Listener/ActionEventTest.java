package awt76.Listener;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * �¼�
 * @author hxy
 *
 */
public class ActionEventTest
{
	public static void main(String[] args)
	{
		Frame frame = new Frame("Test Button");
		
		Button button = new Button("Press Me!");
		
		//�����¼�������
		button.addActionListener(new ButtonHandler());
		
		frame.add(button,BorderLayout.CENTER);
		
		frame.pack();
		
		frame.setVisible(true);
		
	}
}

class ButtonHandler implements ActionListener{
	//���¼�������ʱ���Զ�����
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button has been pressed!");
		
		String label = e.getActionCommand();//���ڰ�ť��˵�����Ƿ���Button�ı�ǩ��
		
		System.out.println(label);
	}
}






















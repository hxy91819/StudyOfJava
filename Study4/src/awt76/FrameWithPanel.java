package awt76;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

/**
 * ≤‚ ‘Panel
 * @author hxy
 *
 */
public class FrameWithPanel extends Frame {
	public FrameWithPanel(String title){
		super(title);
	}
	
	public static void main(String[] args) {
		FrameWithPanel frameWithPanel = new FrameWithPanel("frame with panel");
		
		Panel panel = new Panel();
		
		frameWithPanel.setSize(500,200);
		frameWithPanel.setBackground(Color.black);
		frameWithPanel.setLayout(null);
		
		panel.setSize(100 ,100);
		panel.setBackground(Color.yellow);
		
		frameWithPanel.add(panel);
		
		frameWithPanel.setVisible(true);
	}
}

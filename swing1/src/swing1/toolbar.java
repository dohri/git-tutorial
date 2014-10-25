package swing1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class toolbar extends JPanel implements ActionListener {
	private JButton start;
	private JButton create;
	
	private printtext text;
	
	public toolbar()
	{
		start = new JButton("start");
		create = new JButton("create");
		
		start.addActionListener(this);
		create.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(start);
		add(create);
		
		}
	
	public void settext (printtext t){
		text = t;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton click = (JButton) e.getSource();
		if(click == start){
			text.emittext("hello\n");			
		}
		else if(click == create){
			text.emittext("create game\n");
		}
		
	}
 
}

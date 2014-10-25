package swing1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Mainframe extends JFrame {
	
	private JButton jbtn;
	private JTextArea txtarea;
	private TextPanel txtpanel;
	private toolbar toolbar;
	public String str[] = {"1","2","3","4","5","6","7","8","9","0"};
	
	public Mainframe()
	{
		super("TOWER DEFENSE");

		
		toolbar = new toolbar();
		txtpanel = new TextPanel();
		txtpanel = new TextPanel();
		setLayout(new BorderLayout());
		txtarea =  new JTextArea();
		jbtn = new JButton("Start Game");
		//txtpanel.appendtext("hello");
		toolbar.settext(new printtext(){

			@Override
			public void emittext(String str) {
				txtpanel.appendtext(str);
				
			}
			});
	    add(txtpanel,BorderLayout.CENTER);
	    add(jbtn,BorderLayout.SOUTH);
	    
	    jbtn.addActionListener(new ActionListener() {

	    	
			public void actionPerformed(ActionEvent arg0) {
				
		//			txtarea.setText("hello world");
				txtpanel.appendtext("hello\n");
	
			}
			
	    	//txtarea.append("Kuch bhi\n");
	    }); 
	    
	    
		//JFrame j = new JFrame();
		
	    add(toolbar,BorderLayout.NORTH);
		setSize(1024,540);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}

}

package swing1;

import java.awt.*;
/*import java.awt.Color;
import java.awt.TextArea; */

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class TextPanel extends JPanel {
	private TextArea txtarea;
	
	public TextPanel()
	{
		txtarea = new TextArea();
		setLayout(new BorderLayout());
		add(new JScrollPane(txtarea),BorderLayout.CENTER);
		//txtarea.setBackground(Color.orange);
		
		      GridBagLayout layout = new GridBagLayout();

		      this.setLayout(layout);        
		      GridBagConstraints gbc = new GridBagConstraints();

		      for(int x=0;x<10;x++){
		          gbc.fill = GridBagConstraints.HORIZONTAL;
		          for(int y=0;y<10;y++){
		        	  gbc.gridx = x;
		              gbc.gridy = y;
		          }
		      }
		                
		             //   this.add(new JButton("NA"),gbc);
	}
	
	public void appendtext(String str)	{
		txtarea.append(str);
	    txtarea.setBackground(Color.orange);
	}

}

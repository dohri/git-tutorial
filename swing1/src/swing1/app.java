package swing1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class app {

	private static JButton jb;
	public static void main(String[] args) throws MalformedURLException {
		   
		    URL url = new URL("http://gifmaker.me/files/download/home/20141021/13/3t4vzmr17zecVXh20I3rzz/output_dJd8Ru.gif");
	        Icon icon = new ImageIcon(url);
	        JLabel label = new JLabel(icon);
	  
	        JFrame f = new JFrame("TOWER DEFENSE");
	        jb = new JButton("Enter");
	  //      f.setLayout(new BorderLayout());
	        f.getContentPane().add(label);
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      //  jb.setVisible(true);
	        f.pack();
	        f.setLocationRelativeTo(null);
	        f.setVisible(true);
	        
	       
	        
	        f.setLayout(new BorderLayout());
	        jb.setVisible(true);
	        f.add(jb, BorderLayout.SOUTH);
	        
	        jb.addActionListener(new ActionListener() {
	       
		    	
				public void actionPerformed(ActionEvent arg0) {
        
		SwingUtilities.invokeLater(new Runnable(){

			public void run() {
				f.setVisible(false);
				
				new Mainframe();
				
				
			}
			
		});
		
				}
				
		    	
		    }); 
	} 

}

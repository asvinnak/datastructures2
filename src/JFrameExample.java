
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JWindow;




public class JFrameExample extends JComponent{	
	
	private static JProgressBar progressBar;
    private static JTextArea taskOutput;
    //private static ProgressTaskMonitor progressTaskMonitor;
    static JFrame frame ;
    int progress = 0;
    int counter =0;
    int MAXPROG=100;
    static String userHome= System.getProperty("user.home");
	
/**
   * Get the initial Progress Windows....
*/ 
 public static JWindow createProgressWindow(){
	 	
	  JWindow window = new JWindow();
      ImageIcon ii=new ImageIcon(userHome+"\\.ciscoConfigLite\\resource\\img\\progress.gif");  
      Container progContent = window.getContentPane();
      progContent.setLayout(new GridLayout(2, 2));
      progContent.setBackground(Color.LIGHT_GRAY);
      JLabel execLable = new JLabel("Execution in Progress...");
      progContent.add(execLable);
      JLabel label2 = new JLabel(ii);
      progContent.add(label2);
      window.setBounds(150, 100, 150, 60);
      window.toFront(); 
      window.setVisible(true);
      window.setLocationRelativeTo(null); 
      return window;
}
 

 
 private static void createAndShowGUI(JFrameExample execService) {
     //Create and set up the window.
 	 frame = new JFrame("ConfigLite Executor..."); 
     frame.getContentPane().setLayout(new FlowLayout()); 
     frame.setSize(600, 800); 
     frame.setLocationRelativeTo(null); 
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     //Create and set up the content pane.
     execService.setOpaque(true); //content panes must be opaque
     frame.setContentPane(execService);
     ImageIcon img = new ImageIcon(userHome+"\\.ciscoConfigLite\\resource\\img\\header.png");
     frame.setIconImage(img.getImage());
     //Display the window.
     frame.pack();
     frame.setVisible(true);
     //Instances of javax.swing.SwingWorker are not reusuable, so
     //we create new instances as needed.
 }
 
	  public static void main(String[] args) throws Exception{
		//Create a progress window and show to user that opertion is happening in background....
		  JWindow progWindow = createProgressWindow();
		  Thread.sleep(5000);
		  progWindow.setVisible(false);
		  progWindow.dispose();
		  JFrameExample execService= new JFrameExample();
		  createAndShowGUI(execService);
		  
		  
	  }
}

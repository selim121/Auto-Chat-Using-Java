package AutoChat;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class ChatServer extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JTextArea ca= new JTextArea();
	private JTextField cf=new JTextField();                                  
	private JButton b=new JButton();
	private JLabel l=new JLabel();
	
	ChatServer(){                                                                                         
		
		JFrame f=new JFrame();                                     
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);                      
		f.setVisible(true);
		f.setResizable(false);
		f.setLayout(null);
		f.setSize(400,400);
		f.getContentPane().setBackground(Color.cyan);
		f.setTitle("Server");
		f.add(ca);
		f.add(cf);
		ca.setSize(300,310);
		ca.setLocation(1, 1);
		ca.setBackground(Color.BLACK);
		cf.setSize(300,20);
		cf.setLocation(1,320);
		f.add(b);
		l.setText("SEND");
		b.add(l);
		b.setSize(400,20);
		b.setLocation(300,320);
		
		b.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    
				if(e.getSource()==b) {                           
					
					String text=cf.getText().toLowerCase();
					ca.setForeground(Color.GREEN);
					ca.append("You-->"+text+"\n");
					cf.setText("");
					
					if(text.contains("hi") || text.contains("hello")) {                         
						replyMeth("Hi there");
					}
					else if(text.contains("how are you") || text.contains("how you are") || text.contains("are how you") || text.contains("you how are") || text.contains("howareyou")) {
						replyMeth("I'm Good :).Thankyou for asking");
					}
					else if(text.contains("name")) {
						replyMeth("I'm Server");
					}
					else if(text.contains("happy")) {
						replyMeth("Yes, of course"+ "\nyou?");
					}
                                        else if(text.contains("ok") || text.contains("good") || text.contains("happy") || text.contains("fine") || text.contains("no")) {
						replyMeth("God bless you!");
					}
					else if(text.contains("bye")) {
						replyMeth("Too Soon :( AnyWays"+"\n"+"STAY HOME STAY SAFE ");
					}
					else 
						replyMeth("I Can't Understand");
					
				}
				
			}
			
		});
		
	}
	public void replyMeth(String s) {                          
		ca.append("Server-->"+s+"\n");         
	}
			

}



public class Chat {                                     //Driver Class

	public static void main(String[] args) {             //main class
		
          new ChatServer();                                  // instantiation 
	}

}
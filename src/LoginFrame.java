import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.net.*;


public class LoginFrame extends JFrame{
	JFrame loginFrame;
	JPanel textPanel;
	JLabel hintLabel;
	JLabel roleLabel;
	JTextField idField;
	JPasswordField passwordField;
	
	JRadioButton stockRadioButton;
	JRadioButton salesRadioButton;
	JRadioButton financialRadioButton;
	ButtonGroup userType;
	JButton loginButton;

	String loginMessage="";
	String staffType="StockStaff";
	public static String userName=null;
	String pw=null;
	PrintWriter writer;
	BufferedReader reader;
	Socket socket;
	String backMessage=null;
	public static void main(String[] args){
		LoginFrame loginFrame=new LoginFrame();
		loginFrame.setUpNetworking();
		
	}
	
	public LoginFrame(){
		loginFrame=new JFrame();
		loginFrame.setResizable(false);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		int screenWidth=screenSize.width;
		int screenHeight=screenSize.height;
		int frameWidth=0;
		int frameHeight=0;
		if(screenWidth*3>screenHeight*4){
			frameHeight=screenHeight/2;
			frameWidth=(frameHeight+100)*4/3;
		}
		else{
			frameWidth=screenWidth/2;
			frameHeight=screenHeight*3/4;
		}
		loginFrame.setBounds((screenWidth-frameWidth)/2,(screenHeight-frameHeight)/2,frameWidth,frameHeight);

		loginFrame.setTitle("Login");
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.setVisible(true);
		
		textPanel=new JPanel();
		textPanel.setSize(frameWidth,frameHeight*7/10);
		textPanel.setLocation(0,0);
		hintLabel=new JLabel("");
		hintLabel.setSize(frameWidth,frameHeight/10);
		hintLabel.setLocation(frameWidth/3,0);
		hintLabel.setVisible(true);
		roleLabel=new JLabel("Identity: ");
		roleLabel.setSize(frameWidth/5,frameHeight/10);
		roleLabel.setLocation(frameWidth/8,frameHeight/10);
		roleLabel.setVisible(true);
		stockRadioButton =new JRadioButton("Stock Staff",true);
		stockRadioButton.setSize(frameWidth/5,frameHeight/10);
		stockRadioButton.setLocation(frameWidth*3/10,frameHeight/10);
		stockRadioButton.setVisible(true);
		stockRadioButton.addItemListener(new StockSelected());
		salesRadioButton =new JRadioButton("Sales Staff",true);
		salesRadioButton.setSize(frameWidth/5,frameHeight/10);
		salesRadioButton.setLocation(frameWidth/2,frameHeight/10);
		salesRadioButton.setVisible(true);
		salesRadioButton.addItemListener(new SalesSelected());
		financialRadioButton =new JRadioButton("Financial Staff",true);
		financialRadioButton.setSize(frameWidth/5,frameHeight/10);
		financialRadioButton.setLocation(frameWidth*7/10,frameHeight/10);
		financialRadioButton.setVisible(true);
		financialRadioButton.addItemListener(new FinancialSelected());
		userType=new ButtonGroup();
		userType.add(stockRadioButton);
		userType.add(salesRadioButton);
		userType.add(financialRadioButton);
		
		JLabel idLabel=new JLabel("UserName: ");
		idLabel.setSize(frameWidth/5,frameHeight/10);
		idLabel.setLocation(frameWidth/8,frameHeight*3/10);
		idLabel.setVisible(true);
		idField=new JTextField("Please Enter Your name");
		idField.setSize(frameWidth/2,frameHeight/10);
		idField.setLocation(frameWidth*3/10,frameHeight*3/10);
		idField.addMouseListener(new MouseClickedID());
		idField.setVisible(true);
		JLabel passwordLabel=new JLabel("Password: ");
		passwordLabel.setSize(frameWidth/5,frameHeight/10);
		passwordLabel.setLocation(frameWidth/8,frameHeight/2);
		passwordLabel.setVisible(true);
		passwordField=new JPasswordField("111111");
		passwordField.setSize(frameWidth/2,frameHeight/10);
		passwordField.setLocation(frameWidth*3/10,frameHeight/2);
		passwordField.addMouseListener(new MouseClickedPW());
		passwordField.setVisible(true);
		
		JPanel buttonPanel=new JPanel();
		buttonPanel.setSize(frameWidth,frameHeight/5);
		buttonPanel.setLocation(0,frameHeight*7/10);
		buttonPanel.setVisible(true);
		
		loginButton=new JButton("Login");
		loginButton.setSize(frameWidth*2/5,frameHeight/10);
		loginButton.setLocation(frameWidth*3/10,0);
		loginButton.setVisible(true);
		loginButton.addActionListener(new MouseClicked());
		
		buttonPanel.setLayout(null);
		buttonPanel.add(loginButton);
		textPanel.setLayout(null);
		textPanel.add(hintLabel);
		textPanel.add(roleLabel);
		textPanel.add(stockRadioButton);
		textPanel.add(salesRadioButton);
		textPanel.add(financialRadioButton);
		textPanel.add(idLabel);
		textPanel.add(idField);
		textPanel.add(passwordField);
		textPanel.add(passwordLabel);
		loginFrame.setLayout(null);
		loginFrame.add(buttonPanel);
		loginFrame.add(textPanel);
		loginFrame.repaint();
		
/*		Thread readerThread=new Thread(new IncomingReader());
		readerThread.start();
		*/
	}
	class MouseClickedID implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {idField.setText("");}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		}
	class MouseClickedPW implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {passwordField.setText("");}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		}
	class StockSelected implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			JRadioButton jrb=(JRadioButton) e.getSource(); 
			if(jrb.isSelected()){
				staffType="StockStaff";
			}
		}
		
	}
	class SalesSelected implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			JRadioButton jrb=(JRadioButton) e.getSource(); 
			if(jrb.isSelected()){
				staffType="SalesStaff";
				}
			}
		}
	class FinancialSelected implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			JRadioButton jrb=(JRadioButton) e.getSource(); 
			if(jrb.isSelected()){
				staffType="FinancialStaff";
				}
			}	
		}
	class MouseClicked implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			userName=idField.getText();
			pw=String.valueOf(passwordField.getPassword());
			loginMessage=staffType+";"+userName+";"+pw;
			try{
				writer.println(loginMessage);
				writer.flush();
			}catch(Exception ex){
				ex.printStackTrace();
			}
			try{
				backMessage=reader.readLine();
			}catch(Exception ex){ex.printStackTrace();}
			
			if(backMessage.equals("Success")){
				System.out.println("Login successfully");
				hintLabel.setText("Login successfully");
				loginFrame.dispose();
				if(staffType.equals("StockStaff")){
					StockFrame stockFrame=new StockFrame();
				}else if(staffType.equals("SalesStaff")){
					SalesFrame salesFraem=new SalesFrame();
				}else if(staffType.equals("FinancialStaff")){
					FinancialFrame financialFrame=new FinancialFrame();
				}

			}else{
				System.out.println("Login failed,please try again");
				hintLabel.setText("Login failed,please try again");
			}
		}
		
	}
	public void setUpNetworking(){
		try{
			socket=new Socket("127.0.0.1",5000);
			InputStreamReader streamReader=new InputStreamReader(socket.getInputStream());
			reader=new BufferedReader(streamReader);
			writer=new PrintWriter(socket.getOutputStream());
			System.out.println("Networking established.");

		}catch(Exception e){
			e.printStackTrace();
		}
	}
/*	public class IncomingReader implements Runnable{
		public void run(){

			try{
				
				backMessage=reader.readLine();
				}catch(Exception ex){ex.printStackTrace();}
		}
	}*/
	
	}

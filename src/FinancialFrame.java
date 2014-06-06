import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FinancialFrame extends JFrame{
	JFrame financialFrame;
	JPanel choosePanel;
	JPanel contentPanel;
	CardLayout card;
	
	JTextField iniAmount;
	
	JTextField cusName;
	JTextField inAmount;
	
	JTextField cusName2;
	JTextField outAmount;




	public FinancialFrame() {
		//================Set the frame=========================
		financialFrame=new JFrame("Financial Management");
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		int screenWidth=screenSize.width;
		int screenHeight=screenSize.height;
		int frameWidth=screenWidth*3/4;
		int frameHeight=frameWidth*3/4;
		financialFrame.setBounds((screenWidth-frameWidth)/2,(screenHeight-frameHeight)/2,frameWidth,frameHeight);
		financialFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		financialFrame.setResizable(false);
		
		//================Set the choosePanel===================
		choosePanel=new JPanel();
		choosePanel.setBackground(Color.gray);
		
		JLabel financialManagement=new JLabel("    Account");
		financialManagement.setVisible(true);
		
		JButton iniAccount=new JButton("Initialize");
		iniAccount.addActionListener(new iniAccListener());
		iniAccount.setVisible(true);
		JButton inAccount=new JButton("     In     ");
		inAccount.addActionListener(new inAccListener());
		inAccount.setVisible(true);
		JButton outAccount=new JButton("    Out   ");
		outAccount.addActionListener(new outAccListener());
		outAccount.setVisible(true);
		JButton allAccount=new JButton("     All    ");
		allAccount.addActionListener(new allAccListener());
		allAccount.setVisible(true);
		JButton detAccount=new JButton("  Detail  ");
		detAccount.addActionListener(new detAccListener());
		detAccount.setVisible(true);
		
		choosePanel.add(financialManagement);
		choosePanel.add(iniAccount);
		choosePanel.add(inAccount);
		choosePanel.add(outAccount);
		choosePanel.add(allAccount);
		choosePanel.add(detAccount);
		choosePanel.setLayout(new BoxLayout(choosePanel,BoxLayout.Y_AXIS));
		choosePanel.setVisible(true);
		//================Set the contentPanel===================
		contentPanel=new JPanel();
		card=new CardLayout();
		contentPanel.setLayout(card);
		//===============Welcome panel===============================
		JPanel welcome=new JPanel();
		JLabel welcomelaLabel=new JLabel("Welcom To The Financial Management System, "+LoginFrame.userName);
		welcomelaLabel.setVisible(true);
		welcome.add(BorderLayout.NORTH,welcomelaLabel);
		//===============IniAccount=============================
		JPanel iniAcc=new JPanel();
		JLabel initialAmount=new JLabel("Initial Amount: ");
		initialAmount.setBounds(50,0,125,25);
		iniAmount=new JTextField();
		iniAmount.setBounds(175,0,150,25);
		JButton confirmIniAcc=new JButton("Initialize");
		confirmIniAcc.addActionListener(new ConfirmIniAccListener());
		confirmIniAcc.setBounds(700, 2, 150, 25);
		iniAcc.add(initialAmount);
		iniAcc.add(iniAmount);
		iniAcc.add(confirmIniAcc);
		iniAcc.setLayout(null);
		iniAcc.setVisible(true);
	
		//===============AccIn=============================
		JPanel accIn=new JPanel();
		JLabel customerName=new JLabel("Customer's Name: ");
		customerName.setBounds(50,0,125,25);
		cusName=new JTextField();
		cusName.setBounds(175,0,150,25);
		JLabel inAmo=new JLabel("In Amount: ");
		inAmo.setBounds(400,0,100,25);
		inAmount=new JTextField();
		inAmount.setBounds(500,0,150,25);
		JButton confirmAccIn=new JButton("Account In");
		confirmAccIn.addActionListener(new ConfirmAccInListener());
		confirmAccIn.setBounds(700, 2, 150, 25);
		accIn.add(customerName);
		accIn.add(cusName);
		accIn.add(inAmo);
		accIn.add(inAmount);
		accIn.add(confirmAccIn);
		accIn.setLayout(null);
		
		//===============AccOut=============================
		JPanel accOut=new JPanel();
		JLabel customerName2=new JLabel("Customer's Name: ");
		customerName2.setBounds(50,0,125,25);
		cusName2=new JTextField();
		cusName2.setBounds(175,0,150,25);
		JLabel outAmo=new JLabel("Out Amount: ");
		outAmo.setBounds(400,0,100,25);
		outAmount=new JTextField();
		outAmount.setBounds(500,0,150,25);
		JButton confirmAccOut=new JButton("Account Out");
		confirmAccOut.addActionListener(new ConfirmAccOutListener());
		confirmAccOut.setBounds(700, 2, 150, 25);
		accOut.add(customerName2);
		accOut.add(cusName2);
		accOut.add(outAmo);
		accOut.add(outAmount);
		accOut.add(confirmAccOut);
		accOut.setLayout(null);
		
		//===============AllAccount=============================
		JPanel allAcc=new JPanel();
		JButton confirmShoAcc=new JButton("Show Total Account");
		confirmShoAcc.addActionListener(new ConfirmShoAccListener());
		confirmShoAcc.setBounds(300, 2, 150, 25);
		allAcc.add(confirmShoAcc);
		allAcc.setLayout(null);
		allAcc.setVisible(true);
		
		//===============Detail Account=============================
		JPanel detAcc=new JPanel();
		JButton confirmDetAcc=new JButton("Show Detailed Account");
		confirmDetAcc.addActionListener(new ConfirmDetAccListener());
		confirmDetAcc.setBounds(300, 2, 170, 25);
		detAcc.add(confirmDetAcc);
		detAcc.setLayout(null);
		detAcc.setVisible(true);

		
		//===============Set The Card=============================
		contentPanel.add("Welcome",welcome);
		contentPanel.add("IniAccount",iniAcc);
		contentPanel.add("AccIn",accIn);
		contentPanel.add("AccOut",accOut);
		contentPanel.add("AccShow",allAcc);
		contentPanel.add("AccDetail",detAcc);
		
		financialFrame.add(BorderLayout.WEST,choosePanel);
		financialFrame.add(BorderLayout.CENTER,contentPanel);
		financialFrame.setVisible(true);
		financialFrame.repaint();
	}
	
	class iniAccListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			card.show(contentPanel, "IniAccount");
		}
		
	}
	class ConfirmIniAccListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			String message;
			message="ACCOUNT_INI:"+iniAmount.getText();
			System.out.println(message);
		}
	}
	
	class inAccListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			card.show(contentPanel,"AccIn");
		}
		
	}
	class ConfirmAccInListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String message;
			message="ACCOUNT_IN:"+cusName.getText()+";"+inAmount.getText();
			System.out.println(message);
		}
		
	}
	
	class outAccListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			card.show(contentPanel, "AccOut");
		}
		
	}
	class ConfirmAccOutListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			String message;
			message="ACCOUNT_OUT:"+cusName2.getText()+";"+outAmount.getText();
			System.out.println(message);
		}
	}

	class allAccListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			card.show(contentPanel, "AccShow");
		}
		
	}
	class ConfirmShoAccListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String message;
			message="ACCOUNT_ALL:";
			System.out.println(message);
		}
		
	}
	
	class detAccListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			card.show(contentPanel, "AccDetail");
		}
		
	}
	class ConfirmDetAccListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String message;
			message="ACCOUNT_DET:";
			System.out.println(message);
		}
		
	}
	
}

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class StockFrame extends JFrame{
	JFrame stockFrame;
	JPanel choosePanel;
	JPanel contentPanel;
	CardLayout card;
	
	JTextField comName;
	JTextField comMode;
	JTextField comDIP;
	JTextField comDOP;
	
	JTextField comName2;
	JTextField comMode2;
	
	JTextField comName3;
	JTextField comMode3;
	JTextField comDIP2;
	JTextField comDOP2;
	
	JTextField comName4;
	JTextField comMode4;

	public StockFrame(){
		
		//================Set the frame=========================
		stockFrame=new JFrame("Stock Management");
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		int screenWidth=screenSize.width;
		int screenHeight=screenSize.height;
		int frameWidth=screenWidth*3/4;
		int frameHeight=frameWidth*3/4;
		stockFrame.setBounds((screenWidth-frameWidth)/2,(screenHeight-frameHeight)/2,frameWidth,frameHeight);
		stockFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		stockFrame.setResizable(false);
		
		//================Set the choosePanel===================
		choosePanel=new JPanel();
		choosePanel.setBackground(Color.gray);
		
		JLabel commodityManagement=new JLabel("   Commodity");
		commodityManagement.setVisible(true);

		JButton addCommodity=new JButton("  Add   ");
		addCommodity.setVisible(true);
		addCommodity.addActionListener(new AddComListener());
		JButton delCommodity=new JButton("  Delete");
		delCommodity.addActionListener(new DelComListener());
		addCommodity.setVisible(true);
		JButton updCommodity=new JButton(" Update");
		updCommodity.addActionListener(new UpdComListener());
		updCommodity.setVisible(true);
		JButton finCommodity=new JButton("  Find   ");
		finCommodity.setVisible(true);
		finCommodity.addActionListener(new FinComListener());
		JButton shoCommodity=new JButton("  Show  ");
		shoCommodity.addActionListener(new ShoComListener());
		shoCommodity.setVisible(true);
		
		JLabel divide=new JLabel("==========");
		divide.setVisible(true);
		
		JLabel stockManagement=new JLabel("        Stock  ");
		stockManagement.setVisible(true);
		JButton shoStock=new JButton("   Show ");
		shoStock.addActionListener(new ShoStoListener());
		shoStock.setVisible(true);
		
		choosePanel.add(commodityManagement);
		choosePanel.add(addCommodity);
		choosePanel.add(delCommodity);
		choosePanel.add(updCommodity);
		choosePanel.add(finCommodity);
		choosePanel.add(shoCommodity);
		choosePanel.add(divide);
		choosePanel.add(stockManagement);
		choosePanel.add(shoStock);
		choosePanel.setLayout(new BoxLayout(choosePanel,BoxLayout.Y_AXIS));
		choosePanel.setVisible(true);
		//================Set the contentPanel===================
		contentPanel=new JPanel();
		card=new CardLayout();
		contentPanel.setLayout(card);
		//===============Welcome panel===============================
		JPanel welcome=new JPanel();
		JLabel welcomelaLabel=new JLabel("Welcom To The Stock Management System, "+LoginFrame.userName);
		welcomelaLabel.setVisible(true);
		welcome.add(BorderLayout.NORTH,welcomelaLabel);
		//===============AddComPanel====================================
		JPanel addCom=new JPanel();

		JLabel commodityName=new JLabel("Commodity's Name: ");
		commodityName.setBounds(50,0,150,25);
		comName=new JTextField();
		comName.setBounds(200,0,150,25);
		JLabel commodityMode=new JLabel("Commodity's Mode: ");
		commodityMode.setBounds(400,0,150,25);
		comMode=new JTextField();
		comMode.setBounds(550,0,150,25);
		JLabel commodityDIP=new JLabel("Commodity's price in: ");
		commodityDIP.setBounds(50,25,150,25);
		comDIP=new JTextField();
		comDIP.setBounds(200,25,150,25);
		JLabel commodityDOP=new JLabel("Commodity's price out: ");
		commodityDOP.setBounds(400,25,160,25);
		comDOP=new JTextField();
		comDOP.setBounds(550,25,150,25);
		JButton confirmAdd=new JButton("Add Commodity");
		confirmAdd.addActionListener(new ConfirmAddComListener());
		confirmAdd.setBounds(300,100,150,25);
		confirmAdd.setVisible(true);


		addCom.add(commodityName);
		addCom.add(comName);
		addCom.add(commodityMode);
		addCom.add(comMode);
		addCom.add(commodityDIP);
		addCom.add(comDIP);
		addCom.add(commodityDOP);
		addCom.add(comDOP);
		addCom.add(confirmAdd);
		addCom.setLayout(null);
		
		//===============DelComPanel====================================
		JPanel delCom=new JPanel();
		
		JLabel commodityName2=new JLabel("Commodity's Name: ");
		commodityName2.setBounds(50,0,150,25);
		comName2=new JTextField();
		comName2.setBounds(200,0,150,25);
		JLabel commodityMode2=new JLabel("Commodity's Mode: ");
		commodityMode2.setBounds(400,0,150,25);
		comMode2=new JTextField();
		comMode2.setBounds(550,0,150,25);
		JButton confirmDel=new JButton("Delete Commodity");
		confirmDel.addActionListener(new ConfirmDelComListener());
		confirmDel.setBounds(300,100,150,25);
		confirmDel.setVisible(true);


		delCom.add(commodityName2);
		delCom.add(comName2);
		delCom.add(commodityMode2);
		delCom.add(comMode2);
		delCom.add(confirmDel);
		delCom.setLayout(null);
		
		//===============UpdComPanel====================================
		JPanel updCom=new JPanel();
		JLabel commodityName3=new JLabel("Commodity's Name: ");
		commodityName3.setBounds(50,0,150,25);
		comName3=new JTextField();
		comName3.setBounds(200,0,150,25);
		JLabel commodityMode3=new JLabel("Commodity's Mode: ");
		commodityMode3.setBounds(400,0,150,25);
		comMode3=new JTextField();
		comMode3.setBounds(550,0,150,25);
		JLabel commodityDIP2=new JLabel("Commodity's price in: ");
		commodityDIP2.setBounds(50,25,150,25);
		comDIP2=new JTextField();
		comDIP2.setBounds(200,25,150,25);
		JLabel commodityDOP2=new JLabel("Commodity's price out: ");
		commodityDOP2.setBounds(400,25,160,25);
		comDOP2=new JTextField();
		comDOP2.setBounds(550,25,150,25);
		JButton confirmUpd=new JButton("Update Commodity");
		confirmUpd.addActionListener(new ConfirmUpdComListener());
		confirmUpd.setBounds(300,100,150,25);
		confirmUpd.setVisible(true);


		updCom.add(commodityName3);
		updCom.add(comName3);
		updCom.add(commodityMode3);
		updCom.add(comMode3);
		updCom.add(commodityDIP2);
		updCom.add(comDIP2);
		updCom.add(commodityDOP2);
		updCom.add(comDOP2);
		updCom.add(confirmUpd);
		updCom.setLayout(null);
		
		//===============FinComPanel====================================
		JPanel finCom=new JPanel();
		
		JLabel commodityName4=new JLabel("Commodity's Name: ");
		commodityName4.setBounds(50,0,150,25);
		comName4=new JTextField();
		comName4.setBounds(200,0,150,25);
		JLabel commodityMode4=new JLabel("Commodity's Mode: ");
		commodityMode4.setBounds(400,0,150,25);
		comMode4=new JTextField();
		comMode4.setBounds(550,0,150,25);
		JButton confirmFin=new JButton("Find Commodity");
		confirmFin.addActionListener(new ConfirmFinComListener());
		confirmFin.setBounds(300,25,150,25);
		confirmFin.setVisible(true);


		finCom.add(commodityName4);
		finCom.add(comName4);
		finCom.add(commodityMode4);
		finCom.add(comMode4);
		finCom.add(confirmFin);
		finCom.setLayout(null);	
		
		//===============ShoCustomer=============================
		JPanel shoCom=new JPanel();
		JButton confirmShoCom=new JButton("Show");
		confirmShoCom.addActionListener(new ConfirmShoComListener());
		confirmShoCom.setBounds(300, 2, 150, 25);
			
		shoCom.add(confirmShoCom);
		shoCom.setLayout(null);
		shoCom.setVisible(true);

		//===============ShoStock=============================
		JPanel shoSto=new JPanel();
		JButton confirmShoSto=new JButton("Show");
		confirmShoSto.addActionListener(new ConfirmShoStoListener());
		confirmShoSto.setBounds(300, 2, 150, 25);
			
		shoSto.add(confirmShoSto);
		shoSto.setLayout(null);
		shoSto.setVisible(true);
		
		//===============Set The Card=============================
		contentPanel.add("Welcome",welcome);
		contentPanel.add("AddCommodity",addCom);
		contentPanel.add("DelCommodity",delCom);
		contentPanel.add("UpdCommodity",updCom);
		contentPanel.add("FinCommodity",finCom);
		contentPanel.add("ShoCommodity",shoCom);
		contentPanel.add("ShoStock",shoSto);
		
		stockFrame.add(BorderLayout.WEST,choosePanel);
		stockFrame.add(BorderLayout.CENTER,contentPanel);
		stockFrame.setVisible(true);
		stockFrame.repaint();
	}
	
	class AddComListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			card.show(contentPanel, "AddCommodity");
		}
		
	}
	class ConfirmAddComListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String message;
			message="COMMODITY_ADD:"+comName.getText()+";"+comMode.getText()+";"+comDIP.getText()+";"+comDOP.getText();
			System.out.println(message);
		}
	}
	
	class DelComListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			card.show(contentPanel, "DelCommodity");
		}
		
	}
	class ConfirmDelComListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String message;
			message="COMMODITY_DEL:"+comName2.getText()+";"+comMode2.getText();
			System.out.println(message);
		}
	}
	
	class UpdComListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			card.show(contentPanel, "UpdCommodity");
		}
		
	}
	class ConfirmUpdComListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String message;
			message="COMMODITY_UPD:"+comName3.getText()+";"+comMode3.getText()+";"+comDIP2.getText()+";"+comDOP2.getText();
			System.out.println(message);
		}
	}
	
	class FinComListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			card.show(contentPanel, "FinCommodity");
		}
		
	}
	class ConfirmFinComListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String message;
			message="COMMODITY_FIN:"+comName4.getText()+";"+comMode4.getText();
			System.out.println(message);
		}
		
	}
	
	class ShoComListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			card.show(contentPanel, "ShoCommodity");
		}
		
	}
	class ConfirmShoComListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String message;
			message="COMMODITY_SHO:";
			System.out.println(message);
		}
		
	}
	
	class ShoStoListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			card.show(contentPanel, "ShoStock");
		}
		
	}
	class ConfirmShoStoListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String message;
			message="STOCK_SHO:";
			System.out.println(message);
		}
		
	}
	public static void main(String[] args){
		new StockFrame();
	}
	
}

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SalesFrame extends JFrame{
	JFrame salesFrame;
	JPanel choosePanel;
	JPanel contentPanel;
	
	JTextField cusName;
	JTextField comName;
	JTextField comMode;
	JTextField comAmount;
	JTextField comPrice;
	
	JTextField cusName2;
	JTextField comName2;
	JTextField comMode2;
	JTextField comAmount2;
	JTextField comPrice2;
	
	JTextField fromDateY;
	JTextField fromDateM;
	JTextField fromDateD;
	
	JTextField toDateY;
	JTextField toDateM;
	JTextField toDateD;
	
	JTextField cusName3;
	JTextField comName3;
	JTextField comMode3;
	JTextField comAmount3;
	JTextField comPrice3;
	
	JTextField cusName4;
	JTextField comName4;
	JTextField comMode4;
	JTextField comAmount4;
	JTextField comPrice4;
	CardLayout card;
	
	public SalesFrame(){
		
		//================Set the frame=========================
		salesFrame=new JFrame("Sales Manament");
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		int screenWidth=screenSize.width;
		int screenHeight=screenSize.height;
		int frameWidth=screenWidth*3/4;
		int frameHeight=frameWidth*3/4;
		salesFrame.setBounds((screenWidth-frameWidth)/2,(screenHeight-frameHeight)/2,frameWidth,frameHeight);
		salesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		salesFrame.setResizable(false);
		
		//================Set the choosePanel===================
		choosePanel=new JPanel();
		choosePanel.setBackground(Color.gray);
		
		JLabel importManagement=new JLabel("     Import");
		importManagement.setVisible(true);
		JButton addImport=new JButton("   Add   ");
		addImport.addActionListener(new AddImListener());
		addImport.setVisible(true);
		JButton delImport=new JButton("  Delete");
		delImport.addActionListener(new DelImListener());
		delImport.setVisible(true);
		JButton shoImport=new JButton("  Show  ");
		shoImport.addActionListener(new ShoImListener());
		shoImport.setVisible(true);
				
		JLabel divide1=new JLabel("==========");
		divide1.setVisible(true);
		
		JLabel exportManagement=new JLabel("     Export");
		exportManagement.setVisible(true);
		JButton addExport=new JButton("   Add   ");
		addExport.addActionListener(new AddExListener());
		addExport.setVisible(true);
		JButton delExport=new JButton("  Delete");
		delExport.addActionListener(new DelExListener());
		delExport.setVisible(true);
		JButton shoExport=new JButton("  Show  ");
		shoExport.setVisible(true);
		
		JLabel divide2=new JLabel("==========");
		divide2.setVisible(true);
		
		JLabel customerManagement=new JLabel("    Customer");
		JButton addCustomer=new JButton("   Add   ");
		addCustomer.setVisible(true);
		JButton delCustomer=new JButton("  Delete");
		delCustomer.setVisible(true);
		JButton updCustomer=new JButton("  Update");
		updCustomer.setVisible(true);
		JButton finCustomer=new JButton("  Find    ");
		finCustomer.setVisible(true);
		JButton shoCustomer=new JButton("  Show  ");
		shoCustomer.setVisible(true);
		
		choosePanel.add(importManagement);
		choosePanel.add(addImport);
		choosePanel.add(delImport);
		choosePanel.add(shoImport);
		choosePanel.add(divide1);
		choosePanel.add(exportManagement);
		choosePanel.add(addExport);
		choosePanel.add(delExport);
		choosePanel.add(shoExport);
		choosePanel.add(divide2);
		choosePanel.add(customerManagement);
		choosePanel.add(addCustomer);
		choosePanel.add(delCustomer);
		choosePanel.add(updCustomer);
		choosePanel.add(finCustomer);
		choosePanel.add(shoCustomer);
		choosePanel.setLayout(new BoxLayout(choosePanel, BoxLayout.Y_AXIS));
		
		//===============Set the contentPanel========================
		contentPanel=new JPanel();
		card=new CardLayout();
		contentPanel.setLayout(card);
		//===============Welcome panel===============================
		JPanel welcome=new JPanel();
		JLabel welcomelaLabel=new JLabel("Welcom To The Sales Management System, "+LoginFrame.userName);
		welcomelaLabel.setVisible(true);
		welcome.add(welcomelaLabel);
		//===============AddImPanel====================================
		JPanel addIm=new JPanel();
		JLabel customerName=new JLabel("Customer's Name: ");
		customerName.setBounds(50,0,150,25);
		cusName=new JTextField();
		cusName.setBounds(200,0,150,25);
		JLabel commodityName=new JLabel("Commodity's Name: ");
		commodityName.setBounds(400,0,150,25);
		comName=new JTextField();
		comName.setBounds(550,0,150,25);
		JLabel commodityMode=new JLabel("Commodity's Mode: ");
		commodityMode.setBounds(50,25,150,25);
		comMode=new JTextField();
		comMode.setBounds(200, 25, 150, 25);
		JLabel commodityAmount=new JLabel("Commodity's Amount: ");
		commodityAmount.setBounds(400,25,150,25);
		comAmount=new JTextField();
		comAmount.setBounds(550,25,150,25);
		JLabel commodityPrice=new JLabel("Per Commodity's price: ");
		commodityPrice.setBounds(50,50,150,25);
		comPrice=new JTextField();
		comPrice.setBounds(200,50,150,25);
		JButton confirmAdd=new JButton("Add Import");
		confirmAdd.addActionListener(new ConfirmAddImListener());
		confirmAdd.setBounds(300,100,150,25);
		confirmAdd.setVisible(true);

		addIm.add(customerName);
		addIm.add(cusName);
		addIm.add(commodityName);
		addIm.add(comName);
		addIm.add(commodityMode);
		addIm.add(comMode);
		addIm.add(commodityAmount);
		addIm.add(comAmount);
		addIm.add(commodityPrice);
		addIm.add(comPrice);
		addIm.add(confirmAdd);
		addIm.setLayout(null);
		
		//===============DELImpanel=============================
		JPanel delIm=new JPanel();
		JLabel customerName2=new JLabel("Customer's Name: ");
		customerName2.setBounds(50,0,150,25);
		cusName2=new JTextField();
		cusName2.setBounds(200,0,150,25);
		JLabel commodityName2=new JLabel("Commodity's Name: ");
		commodityName2.setBounds(400,0,150,25);
		comName2=new JTextField();
		comName2.setBounds(550,0,150,25);
		JLabel commodityMode2=new JLabel("Commodity's Mode: ");
		commodityMode2.setBounds(50,25,150,25);
		comMode2=new JTextField();
		comMode2.setBounds(200, 25, 150, 25);
		JLabel commodityAmount2=new JLabel("Commodity's Amount: ");
		commodityAmount2.setBounds(400,25,150,25);
		comAmount2=new JTextField();
		comAmount2.setBounds(550,25,150,25);
		JLabel commodityPrice2=new JLabel("Per Commodity's price: ");
		commodityPrice2.setBounds(50,50,150,25);
		comPrice2=new JTextField();
		comPrice2.setBounds(200,50,150,25);
		JButton confirmDel=new JButton("Delete Import");
		confirmDel.addActionListener(new ConfirmDelImListener());
		confirmDel.setBounds(300,100,150,25);
		confirmDel.setVisible(true);

		delIm.add(customerName2);
		delIm.add(cusName2);
		delIm.add(commodityName2);
		delIm.add(comName2);
		delIm.add(commodityMode2);
		delIm.add(comMode2);
		delIm.add(commodityAmount2);
		delIm.add(comAmount2);
		delIm.add(commodityPrice2);
		delIm.add(comPrice2);
		delIm.add(confirmDel);
		delIm.setLayout(null);
		//===============ShoImPanel=============================
		JPanel shoIm=new JPanel();
		JLabel fromDate=new JLabel("From Date: ");
		fromDate.setBounds(50,0,100,25);
		fromDateY=new JTextField();
		fromDateY.setBounds(150,0,50,25);
		JLabel fdY=new JLabel("Y");
		fdY.setBounds(200,0,15,25);
		fromDateM=new JTextField();
		fromDateM.setBounds(215,0,35,25);
		JLabel fdM=new JLabel("M");
		fdM.setBounds(250,0,15,25);
		fromDateD=new JTextField();
		fromDateD.setBounds(265,0,35,25);
		JLabel fdD=new JLabel("D");
		fdD.setBounds(300,0,15,25);
		
		JLabel toDate=new JLabel("To Date: ");
		toDate.setBounds(400,0,100,25);
		toDateY=new JTextField();
		toDateY.setBounds(500,0,50,25);
		JLabel tdY=new JLabel("Y");
		tdY.setBounds(550,0,15,25);
		toDateM=new JTextField();
		toDateM.setBounds(565,0,35,25);
		JLabel tdM=new JLabel("M");
		tdM.setBounds(600,0,15,25);
		toDateD=new JTextField();
		toDateD.setBounds(615,0,35,25);
		JLabel tdD=new JLabel("D");
		tdD.setBounds(650,0,15,25);
		JButton confirmSho=new JButton("Show");
		confirmSho.addActionListener(new ConfirmShoListener());
		confirmSho.setBounds(700, 2, 150, 25);

		
		shoIm.add(fromDate);
		shoIm.add(fromDateY);
		shoIm.add(fdY);
		shoIm.add(fromDateM);
		shoIm.add(fdM);
		shoIm.add(fromDateD);
		shoIm.add(fdD);
		shoIm.add(toDate);
		shoIm.add(toDateY);
		shoIm.add(tdY);
		shoIm.add(toDateM);
		shoIm.add(tdM);
		shoIm.add(toDateD);
		shoIm.add(tdD);
		shoIm.add(confirmSho);
		shoIm.setLayout(null);
		
		//===============AddExPanel=============================
		JPanel addEx=new JPanel();
		JLabel customerName3=new JLabel("Customer's Name: ");
		customerName3.setBounds(50,0,150,25);
		cusName3=new JTextField();
		cusName3.setBounds(200,0,150,25);
		JLabel commodityName3=new JLabel("Commodity's Name: ");
		commodityName3.setBounds(400,0,150,25);
		comName3=new JTextField();
		comName3.setBounds(550,0,150,25);
		JLabel commodityMode3=new JLabel("Commodity's Mode: ");
		commodityMode3.setBounds(50,25,150,25);
		comMode3=new JTextField();
		comMode3.setBounds(200, 25, 150, 25);
		JLabel commodityAmount3=new JLabel("Commodity's Amount: ");
		commodityAmount3.setBounds(400,25,150,25);
		comAmount3=new JTextField();
		comAmount3.setBounds(550,25,150,25);
		JLabel commodityPrice3=new JLabel("Per Commodity's price: ");
		commodityPrice3.setBounds(50,50,150,25);
		comPrice3=new JTextField();
		comPrice3.setBounds(200,50,150,25);
		JButton confirmAdd1=new JButton("Add Export");
		confirmAdd1.addActionListener(new ConfirmAddExListener());
		confirmAdd1.setBounds(300,100,150,25);
		confirmAdd1.setVisible(true);

		addEx.add(customerName3);
		addEx.add(cusName3);
		addEx.add(commodityName3);
		addEx.add(comName3);
		addEx.add(commodityMode3);
		addEx.add(comMode3);
		addEx.add(commodityAmount3);
		addEx.add(comAmount3);
		addEx.add(commodityPrice3);
		addEx.add(comPrice3);
		addEx.add(confirmAdd1);
		addEx.setLayout(null);
		
		//===============DELExpanel=============================
		JPanel delEx=new JPanel();
		JLabel customerName4=new JLabel("Customer's Name: ");
		customerName4.setBounds(50,0,150,25);
		cusName4=new JTextField();
		cusName4.setBounds(200,0,150,25);
		JLabel commodityName4=new JLabel("Commodity's Name: ");
		commodityName4.setBounds(400,0,150,25);
		comName4=new JTextField();
		comName4.setBounds(550,0,150,25);
		JLabel commodityMode4=new JLabel("Commodity's Mode: ");
		commodityMode4.setBounds(50,25,150,25);
		comMode4=new JTextField();
		comMode4.setBounds(200, 25, 150, 25);
		JLabel commodityAmount4=new JLabel("Commodity's Amount: ");
		commodityAmount4.setBounds(400,25,150,25);
		comAmount4=new JTextField();
		comAmount4.setBounds(550,25,150,25);
		JLabel commodityPrice4=new JLabel("Per Commodity's price: ");
		commodityPrice4.setBounds(50,50,150,25);
		comPrice4=new JTextField();
		comPrice4.setBounds(200,50,150,25);
		JButton confirmDel2=new JButton("Delete Export");
		confirmDel2.addActionListener(new ConfirmDelExListener());
		confirmDel2.setBounds(300,100,150,25);
		confirmDel2.setVisible(true);

		delEx.add(customerName4);
		delEx.add(cusName4);
		delEx.add(commodityName4);
		delEx.add(comName4);
		delEx.add(commodityMode4);
		delEx.add(comMode4);
		delEx.add(commodityAmount4);
		delEx.add(comAmount4);
		delEx.add(commodityPrice4);
		delEx.add(comPrice4);
		delEx.add(confirmDel2);
		delEx.setLayout(null);
		
		contentPanel.add("Welcome",welcome);
		contentPanel.add("AddImport",addIm);
		contentPanel.add("DelImport",delIm);
		contentPanel.add("ShoImport",shoIm);
		contentPanel.add("AddExport",addEx);
		contentPanel.add("DelExport",delEx);
		contentPanel.setVisible(true);
		
		salesFrame.add(BorderLayout.WEST,choosePanel);
		salesFrame.add(BorderLayout.CENTER,contentPanel);
		salesFrame.setVisible(true);
		salesFrame.repaint();
	}
	
	class AddImListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			card.show(contentPanel, "AddImport");
		}
		
	}
	class ConfirmAddImListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String message;
			message="IMPORT_ADD:"+cusName.getText()+";"+comName.getText()+";"+comMode.getText()+";"+comAmount.getText()+";"+comPrice.getText();
			System.out.println(message);
		}
		
	}
	
	class DelImListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			card.show(contentPanel, "DelImport");
		}
		
	}
	class ConfirmDelImListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String message;
			message="IMPORT_DEL:"+cusName2.getText()+";"+comName2.getText()+";"+comMode2.getText()+";"+comAmount2.getText()+";"+comPrice2.getText();
			System.out.println(message);
		}
		
	}
	
	class ShoImListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			card.show(contentPanel, "ShoImport");
		}
		
	}
	class ConfirmShoListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String message;
			message="IMPORT_SHO:"+fromDateY.getText()+"/"+fromDateM.getText()+"/"+fromDateD.getText()+";"+toDateY.getText()+"/"+toDateM.getText()+"/"+toDateD.getText();
			System.out.println(message);
		}
		
	}
	
	class AddExListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			card.show(contentPanel, "AddExport");
		}
		
	}
	
	class ConfirmAddExListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String message;
			message="EXPORT_ADD:"+cusName3.getText()+";"+comName3.getText()+";"+comMode3.getText()+";"+comAmount3.getText()+";"+comPrice3.getText();
			System.out.println(message);
		}
		
	}
	
	class DelExListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			card.show(contentPanel, "DelExport");
		}
		
	}
	class ConfirmDelExListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String message;
			message="EXPORT_DEL:"+cusName4.getText()+";"+comName4.getText()+";"+comMode4.getText()+";"+comAmount4.getText()+";"+comPrice4.getText();
			System.out.println(message);
	
		}
		
	}
	
	public static void main(String[] args){
		new SalesFrame();
	}
	
}

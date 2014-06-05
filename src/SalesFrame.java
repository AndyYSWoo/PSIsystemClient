import javax.swing.*;

import java.awt.*;


public class SalesFrame extends JFrame{
	JFrame salesFrame;
	JPanel choosePanel;
	JLabel importManagement;
	JButton addImport;
	JButton delImport;
	JButton shoImport;
	JLabel divide1;
	JLabel divide2;
	JLabel exportManagement;
	JButton addExport;
	JButton delExport;
	JButton shoExport;
	JLabel customerManagement;
	JButton addCustomer;
	JButton delCustomer;
	JButton updCustomer;
	JButton finCustomer;
	JButton shoCustomer;
	public SalesFrame(){
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
		
		choosePanel=new JPanel();
		choosePanel.setBackground(Color.gray);
		
		importManagement=new JLabel("     Import");
		importManagement.setVisible(true);
		addImport=new JButton("   Add   ");
		addImport.setVisible(true);
		delImport=new JButton("  Delete");
		delImport.setVisible(true);
		shoImport=new JButton("  Show  ");
		shoImport.setVisible(true);
				
		divide1=new JLabel("==========");
		divide1.setVisible(true);
		
		exportManagement=new JLabel("     Export");
		exportManagement.setVisible(true);
		addExport=new JButton("   Add   ");
		addExport.setVisible(true);
		delExport=new JButton("  Delete");
		delExport.setVisible(true);
		shoExport=new JButton("  Show  ");
		shoExport.setVisible(true);
		
		divide2=new JLabel("==========");
		divide2.setVisible(true);
		
		customerManagement=new JLabel("    Customer");
		addCustomer=new JButton("   Add   ");
		addCustomer.setVisible(true);
		delCustomer=new JButton("  Delete");
		delCustomer.setVisible(true);
		updCustomer=new JButton("  Update");
		updCustomer.setVisible(true);
		finCustomer=new JButton("  Find    ");
		finCustomer.setVisible(true);
		shoCustomer=new JButton("  Show  ");
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
		salesFrame.add(BorderLayout.WEST,choosePanel);
		salesFrame.setVisible(true);
		salesFrame.repaint();
	}
/*	public static void main(String[] args){
		new SalesFrame();
	}
	*/
}

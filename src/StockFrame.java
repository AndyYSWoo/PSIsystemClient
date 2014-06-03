import java.awt.*;

import javax.swing.*;


public class StockFrame extends JFrame{
	JFrame stockFrame;
	JPanel choosePanel;
	JLabel stockManagement;
	JLabel divide;
	JLabel commodityManagement;
	JButton addCommodity;
	JButton delCommodity;
	JButton updCommodity;
	JButton finCommodity;
	JButton shoCommodity;
	JButton shoStock;
	public StockFrame(){
		stockFrame=new JFrame();
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		int screenWidth=screenSize.width;
		int screenHeight=screenSize.height;
		int frameWidth=screenWidth*3/4;
		int frameHeight=frameWidth*3/4;
		stockFrame.setBounds((screenWidth-frameWidth)/2,(screenHeight-frameHeight)/2,frameWidth,frameHeight);
		stockFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		choosePanel=new JPanel();
		choosePanel.setBackground(Color.gray);
		commodityManagement=new JLabel("   Commodity");
		commodityManagement.setVisible(true);

		addCommodity=new JButton("  Add   ");
		addCommodity.setVisible(true);
		delCommodity=new JButton("  Delete");
		addCommodity.setVisible(true);
		updCommodity=new JButton(" Update");
		updCommodity.setVisible(true);
		finCommodity=new JButton("  Find   ");
		finCommodity.setVisible(true);
		shoCommodity=new JButton("  Show  ");
		shoCommodity.setVisible(true);
		
		divide=new JLabel("==========");
		divide.setVisible(true);
		
		stockManagement=new JLabel("        Stock  ");
		stockManagement.setVisible(true);
		shoStock=new JButton("   Show ");
		
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
		stockFrame.add(BorderLayout.WEST,choosePanel);
		stockFrame.setVisible(true);
		stockFrame.repaint();
	}
	public static void main(String[] args){
		new StockFrame();
	}
	
}

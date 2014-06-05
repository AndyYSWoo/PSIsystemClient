import java.awt.*;

import javax.swing.*;


public class FinancialFrame extends JFrame{
	JFrame financialFrame;
	JPanel choosePanel;
	JLabel financialManagement;
	JButton iniAccount;
	JButton inAccount;
	JButton outAccount;
	JButton allAccount;
	JButton detAccount;
	public FinancialFrame() {
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
		
		choosePanel=new JPanel();
		choosePanel.setBackground(Color.gray);
		
		financialManagement=new JLabel("    Account");
		financialManagement.setVisible(true);
		
		iniAccount=new JButton("Initialize");
		iniAccount.setVisible(true);
		inAccount=new JButton("     In     ");
		inAccount.setVisible(true);
		outAccount=new JButton("    Out   ");
		outAccount.setVisible(true);
		allAccount=new JButton("     All    ");
		allAccount.setVisible(true);
		detAccount=new JButton("  Detail  ");
		detAccount.setVisible(true);
		
		choosePanel.add(financialManagement);
		choosePanel.add(iniAccount);
		choosePanel.add(inAccount);
		choosePanel.add(outAccount);
		choosePanel.add(allAccount);
		choosePanel.add(detAccount);
		choosePanel.setLayout(new BoxLayout(choosePanel,BoxLayout.Y_AXIS));
		choosePanel.setVisible(true);
		financialFrame.add(BorderLayout.WEST,choosePanel);
		financialFrame.setVisible(true);
		financialFrame.repaint();
	}
/*	public static void main(String[] args){
		new FinancialFrame();
	}
	*/
}

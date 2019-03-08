package phoneDialer;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PhoneDialer implements ActionListener {
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton button0;
	JButton dash;
	JButton dialNumber;
	String phoneNumber = "";
	JFrame myFrame;
	JPanel myPanel;
	JPanel myPanelLabel;
	JLabel myLabel;
	JPanel myPanelNum;
	

	public PhoneDialer () {
		myFrame = new JFrame();
		myFrame.setSize(200, 250);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myPanel = new JPanel();
		myFrame.setContentPane(myPanel);
		myPanel.setLayout(new BoxLayout(myPanel,BoxLayout.Y_AXIS));
		myPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		myPanelLabel = new JPanel();
		FlowLayout layout = new FlowLayout();
		myPanelLabel.setLayout(layout);
		myLabel = new JLabel("Enter the number to dial:");
		myPanelLabel.add(myLabel);
		
		myPanelNum = new JPanel();
		myPanelNum.setLayout(new GridLayout(4,3,5,5));
		myPanelNum.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		
		button1 = new JButton("1");
		button1.addActionListener(this);
		myPanelNum.add(button1);
		button2 = new JButton("2");
		button2.addActionListener(this);
		myPanelNum.add(button2);
		button3 = new JButton("3");
		button3.addActionListener(this);
		myPanelNum.add(button3);
		button4 = new JButton("4");
		button4.addActionListener(this);
		myPanelNum.add(button4);
		button5 = new JButton("5");
		button5.addActionListener(this);
		myPanelNum.add(button5);
		button6 = new JButton("6");
		button6.addActionListener(this);
		myPanelNum.add(button6);
		button7 = new JButton("7");
		button7.addActionListener(this);
		myPanelNum.add(button7);
		button8 = new JButton("8");
		button8.addActionListener(this);
		myPanelNum.add(button8);
		button9 = new JButton("9");
		button9.addActionListener(this);
		myPanelNum.add(button9);
		dash = new JButton("-");
		dash.addActionListener(this);
		myPanelNum.add(dash);
		button0 = new JButton("0");
		button0.addActionListener(this);
		myPanelNum.add(button0);
		
		myPanel.add(myPanelLabel);
		myPanel.add(myPanelNum);
		
		dialNumber = new JButton("Dial Number");
		dialNumber.setAlignmentX(Component.CENTER_ALIGNMENT);
		dialNumber.addActionListener(this);
		myPanel.add(dialNumber);
		
		myFrame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new PhoneDialer();

	}

	@Override
	public void actionPerformed(ActionEvent event) {
		Object control = event.getSource();
		
		if (control == dialNumber) {
			JOptionPane.showMessageDialog(myFrame, "Dialing:" + phoneNumber);
			phoneNumber = "";
		}
		
		else if (control == button1) {
			phoneNumber += "1";
		}
		
		else if (control == button2) {
			phoneNumber += "2";
		}
		
		else if (control == button3) {
			phoneNumber += "3";
		}
		
		else if (control == button4) {
			phoneNumber += "4";
		}
		
		else if (control == button5) {
			phoneNumber += "5";
		}
		
		else if (control == button6) {
			phoneNumber += "6";
		}
		
		else if (control == button7) {
			phoneNumber += "7";
		}
		
		else if (control == button8) {
			phoneNumber += "8";
		}
		
		else if (control == button9) {
			phoneNumber += "9";
		}
		
		else if (control == button0) {
			phoneNumber += "0";
		}
		
		else if (control == dash) {
			phoneNumber += "-";
		}
		
	}

}

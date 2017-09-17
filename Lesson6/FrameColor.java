package lesson6;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

import javax.swing.*;

public class FrameColor 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Rainbow Color Frame");
		frame.setSize(1100, 200);
		frame.setLocation(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		placeComponent(frame);
		frame.setVisible(true);
	}
	
	public static void placeComponent(JFrame frame)
	{
		frame.setLayout(null);
		
		JButton redButton = new JButton();
		redButton.setBounds(5, 5, 150, 150);
		redButton.setBackground(Color.RED);
		//redButton.setForeground(Color.RED); //Color.RED;
		redButton.setOpaque(true);
		redButton.setBorderPainted(false);
		redButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//JOptionPane optionPane = new JOptionPane("Color Meaning");
				String message = "Red signifies passion, vitality, enthusiasm and security";
				showMessage(message, redButton);
				}
		});
		frame.add(redButton);
		
		JButton orangeButton = new JButton();
		orangeButton.setBounds(160, 5, 150, 150);
		orangeButton.setBackground(Color.ORANGE);
		//redButton.setForeground(Color.RED); //Color.RED;
		orangeButton.setOpaque(true);
		orangeButton.setBorderPainted(false);
		orangeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//JOptionPane optionPane = new JOptionPane("Color Meaning");
				String message = "You clicked on Orange Button";
				showMessage(message, orangeButton);
				}
		});
		frame.add(orangeButton);
		
		JButton greenButton = new JButton();
		greenButton.setBounds(315, 5, 150, 150);
		greenButton.setBackground(Color.GREEN);
		//redButton.setForeground(Color.RED); //Color.RED;
		greenButton.setOpaque(true);
		greenButton.setBorderPainted(false);
		greenButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//JOptionPane optionPane = new JOptionPane("Color Meaning");
				String message = "You clicked on Green Button";
				showMessage(message, greenButton);
				}
		});
		frame.add(greenButton);
		
		JButton blueButton = new JButton();
		blueButton.setBounds(470, 5, 150, 150);
		blueButton.setBackground(Color.BLUE);
		//redButton.setForeground(Color.RED); //Color.RED;
		blueButton.setOpaque(true);
		blueButton.setBorderPainted(false);
		blueButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//JOptionPane optionPane = new JOptionPane("Color Meaning");
				String message = "You clicked on Blue Button";
				showMessage(message, orangeButton);
				}
		});
		frame.add(blueButton);
		
		JButton yellowButton = new JButton();
		yellowButton.setBounds(625, 5, 150, 150);
		yellowButton.setBackground(Color.YELLOW);
		//redButton.setForeground(Color.RED); //Color.RED;
		yellowButton.setOpaque(true);
		yellowButton.setBorderPainted(false);
		yellowButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//JOptionPane optionPane = new JOptionPane("Color Meaning");
				String message = "You clicked on Yellow Button";
				showMessage(message, orangeButton);
				}
		});
		frame.add(yellowButton);
		
		JButton darkPurpleButton = new JButton();
		darkPurpleButton.setBounds(780, 5, 150, 150);
		Color col = new Color(75,0,130);
		darkPurpleButton.setBackground(col);
		//redButton.setForeground(Color.RED); //Color.RED;
		darkPurpleButton.setOpaque(true);
		darkPurpleButton.setBorderPainted(false);
		darkPurpleButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//JOptionPane optionPane = new JOptionPane("Color Meaning");
				String message = "You clicked on Dark Purple Button";
				showMessage(message, darkPurpleButton);
				}
		});
		frame.add(darkPurpleButton);
		
		JButton lightPurpleButton = new JButton();
		lightPurpleButton.setBounds(935, 5, 150, 150);
		Color col2 = new Color(138,43,226);
		lightPurpleButton.setBackground(col2);
		//redButton.setForeground(Color.RED); //Color.RED;
		lightPurpleButton.setOpaque(true);
		lightPurpleButton.setBorderPainted(false);
		lightPurpleButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//JOptionPane optionPane = new JOptionPane("Color Meaning");
				String message = "You clicked on Light Purple Button";
				showMessage(message, lightPurpleButton);
				}
		});
		frame.add(lightPurpleButton);
	}
	
	private static void showMessage(String message, JButton button)
	{
		JOptionPane.showMessageDialog(button, message, "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
		
	}
}

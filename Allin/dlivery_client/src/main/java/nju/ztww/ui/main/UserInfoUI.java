package nju.ztww.ui.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import nju.ztww.service.UserService;
import nju.ztww.serviceimpl.UserLoginImpl;
import nju.ztww.vo.ManaUserVO;
import confligUI.MyLabel;
import confligUI.MyTextField;

public class UserInfoUI extends JPanel{
	public static JTextArea USERID = new JTextArea();
	Image photo;
	
	public UserInfoUI(String userID){
		loadImage();
		this.setBounds(0, 0, 150, 100);
		this.setLayout(null);
		MyLabel label=new MyLabel();
		USERID.setText(userID);
		//USERID.setBounds(60, 80, 80, 20);
		//USERID.setBackground(Color.orange);
		//this.add(USERID);
		init();
	}
	
	public static String getUserID(){
		return USERID.getText();
	}
	
	 public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			Image background=new ImageIcon("photo/User.png").getImage();
			g.drawImage(background, 0,0,null);
			g.drawImage(photo, 10, 10, 55, 55, null);
			
		}
	public void init(){
		UserService us = new UserLoginImpl();
 		ManaUserVO userInfo = us.findByID(UserInfoUI.getUserID());
 		String name = userInfo.getName();
 		String position = userInfo.getPosition();
 		String idField = "ID: ";
		MyTextField text1 = new MyTextField();
		MyTextField text2 = new MyTextField();
		MyTextField text3 = new MyTextField();
		MyTextField text4 = new MyTextField();
		text1.setText(name);
		text2.setText(position);
		text3.setText(idField);
		text4.setText(UserInfoUI.getUserID());
		text1.setBounds(70,10,60,20);
		text2.setBounds(70,40,60,20);
		text3.setBounds(10,80, 30, 20);
		text4.setBounds(50, 80, 100, 20);
		text1.setEditable(false);
		text2.setEditable(false);
		text3.setEditable(false);
		text4.setEditable(false);
		text1.setHorizontalAlignment(JTextField.CENTER);
		text2.setHorizontalAlignment(JTextField.CENTER);
		text3.setHorizontalAlignment(JTextField.CENTER);
		this.add(text1);
		this.add(text2);
		this.add(text3);
		this.add(text4);
	}
	
	public void loadImage(){
		try {
			 photo = ImageIO.read(new FileInputStream("photo2/icon.png"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}

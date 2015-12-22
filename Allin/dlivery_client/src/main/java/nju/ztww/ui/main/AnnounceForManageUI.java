package nju.ztww.ui.main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import nju.ztww.thread.WriteHandlerThread;

public class AnnounceForManageUI extends JPanel implements Runnable{
	private boolean ifOK=true;
	private JButton add=new JButton();
	private JButton sure=new JButton("确定发送");
	private JDialog dlg=new JDialog();
	private JLabel label=new JLabel("请输入消息");
	private JTextArea text=new JTextArea();
	java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit()
			.getScreenSize();
	Thread t=new Thread(this);
	public AnnounceForManageUI(){
		final ImageIcon ADD=new ImageIcon("photo/1.gif");
		add.setIcon(null);
		add.setBounds(700, 5, 40, 40);
		add.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				dlg.setSize(new Dimension(450, 360));
	            dlg.setLocation((screenSize.width-700)/2, (screenSize.height-600)/2);
	            label.setBounds(10, 10, 100, 20);
	            text.setBounds(10, 40, 410, 240);
	            sure.setBounds(50, 290, 300, 20);
	            sure.addActionListener(sureListener);
	            dlg.add(sure);
	            dlg.add(label);
	            dlg.add(text);
	            dlg.setLayout(null);
				dlg.setVisible(true);
			}
			
		});
		this.add(add);
		this.setLayout(null);
		this.setBounds(150, 550, 750, 50);
		this.setVisible(true);
		t.start();
	}
	
	ActionListener sureListener=new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			WriteHandlerThread.message=text.getText();
			WriteHandlerThread.ifSend=false;
			text.setText("");
		}
	};
	
	 public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			Image background=new ImageIcon("photo/bottom.png").getImage();
			g.drawImage(background, 0,0,null);
			
		}

	public void run() {
		// TODO Auto-generated method stub
		try {
			ServerSocket serverSocket = new ServerSocket(54421);
			while(true){
				Socket client = serverSocket.accept();
				System.out.println("accept");
				new WriteHandlerThread (client);
//				while(true){
//					PrintWriter out = new PrintWriter( new BufferedWriter( new OutputStreamWriter(client.getOutputStream())),true);      
//					out.println("aaaa"); 
//					}
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}

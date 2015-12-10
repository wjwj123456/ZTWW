package nju.ztww.ui.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ThemeLabelUI extends JPanel implements Runnable{
	
	private JLabel time=new JLabel();
	Thread t=new Thread(this);
	private String DAY=null;

	public ThemeLabelUI(){
		Calendar cal = Calendar.getInstance(); // 创建一个日历对象。
		DAY=convert(cal.get(Calendar.DAY_OF_WEEK) - 1);
		t.start();
		time.setBounds(513, 28, 250, 35);
		time.setFont(new Font(Font.DIALOG,0,14));
		time.setForeground(new Color(135,51,36));
		this.setLayout(null);
		this.add(time);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		Image lable=new ImageIcon("photo/theme.png").getImage();
		g.drawImage(lable, 0,0,null);
		
	}

	public void run() {
		while(true){
			Date dt=new Date();
		     SimpleDateFormat matter1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		    
		     time.setText(matter1.format(dt)+"  "+DAY);
		     try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	static String convert(int val){
	String retStr = "";
	switch (val) {
	case 0:
	return "星期日";
	case 1:
	return "星期一";
	case 2:
	return "星期二";
	case 3:
	return "星期三";
	case 4:
	return "星期四";
	case 5:
	return "星期五";
	case 6:
	return "星期六";
	default:
	break;
	}
	return retStr;
	}
}

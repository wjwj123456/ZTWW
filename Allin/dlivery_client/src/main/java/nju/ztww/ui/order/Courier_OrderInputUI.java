package nju.ztww.ui.order;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Courier_OrderInputUI extends JPanel{
	
	JButton addButton = new JButton();
	JButton sureButton = new JButton();
	JDialog addDlg ;
	DefaultTableModel defaultTableModel;
	JTable table = new JTable();
	
	
	private JLabel numbersLabel = new JLabel();
	private JTextField numbers = new JTextField();
	private JLabel orderNumLabel = new JLabel();
	private JTextField orderNum = new JTextField();
	private JLabel senderLabel = new JLabel();
	private JTextField sender = new JTextField();
	private JLabel ognizationLabel = new JLabel();
	private JTextField ognization = new JTextField();
	private JLabel senderTELLabel = new JLabel();
	private JTextField senderTEL = new JTextField();
	private JLabel senderPhoneLabel = new JLabel();
	private JTextField senderPhone = new JTextField();
	private JLabel receiverLabel = new JLabel();
	private JTextField receiver = new JTextField();
	private JLabel placeLabel = new JLabel();
	private JTextField place = new JTextField();
	private JLabel receiverTELLabel = new JLabel();
	private JTextField receiverTEL = new JTextField();
	private JLabel receiverPhoneLabel = new JLabel();
	private JTextField receiverPhone = new JTextField();
	private JLabel goodInfoLabel = new JLabel();
	private JTextField goodInfo = new JTextField();
	private JLabel costLabel = new JLabel();
	private JTextField cost = new JTextField();
	private JLabel typeLabel = new JLabel();
	private JTextField type = new JTextField();
	private JLabel estTimeLabel = new JLabel();
	private JTextField estTime = new JTextField();
	
	
	
	
	java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit()
			.getScreenSize();
	
	public Courier_OrderInputUI(){
		this.setLayout(null);
		{/*for Button*/
			addButton.setBounds(500, 420, 110, 38);
			addButton.setIcon(new ImageIcon("photo/add.gif"));
			this.add(addButton);
			addButton.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					// to add a dialog to complete
					//very important
					//including all the information and layout
					addDlg = new JDialog();
					addDlg.setSize(new Dimension(600, 450));
		            addDlg.setLocation((screenSize.width-700)/2, (screenSize.height-600)/2);
		            sureButton.setText("确定");
		 
		            numbersLabel.setBounds(50, 20, 150, 20);
		            numbersLabel.setText("营业厅编号");
		            numbers.setBounds(120, 20, 100, 20);
		            orderNumLabel.setBounds(300, 20, 150, 20);
		            orderNumLabel.setText("订单号");
		            orderNum.setBounds(350, 20, 100, 20);
		            
		            senderLabel.setBounds(50, 70, 150, 20);
		            senderLabel.setText("寄件人");
		            sender.setBounds(100, 70, 100, 20); 
		            senderPhoneLabel.setBounds(300, 70, 150, 20);   
		            senderPhoneLabel.setText("手机");
		            senderPhone.setBounds(350, 70, 150, 20);  
		            
		            ognizationLabel.setBounds(50, 100, 150, 20);
		            ognizationLabel.setText("单位");
		            ognization.setBounds(100, 100, 150, 20);
		            senderTELLabel.setBounds(300, 100, 150, 20);
		            senderTELLabel.setText("电话");
		            senderTEL.setBounds(350, 100, 150, 20);
		            
		            receiverLabel.setBounds(50, 150, 150, 20);
		            receiverLabel.setText("收件人");
		            receiver.setBounds(100, 150, 150, 20);
		            receiverPhoneLabel.setBounds(300, 150, 150, 20);
		            receiverPhoneLabel.setText("手机");
		            receiverPhone.setBounds(350, 150, 150, 20);
		            
		            placeLabel.setBounds(50, 180, 150, 20);
		            placeLabel.setText("地址");
		            place.setBounds(100, 180, 350, 40);;
		            
		            goodInfoLabel.setBounds(50, 260, 150, 20);
		            goodInfoLabel.setText("货物信息");
		            goodInfo.setBounds(120, 260, 150, 20);
		            costLabel.setBounds(300, 260, 150, 20);
		            costLabel.setText("运费");
		            cost.setBounds(370, 260, 150, 20);
		            
		            typeLabel.setBounds(50, 290, 150, 20);
		            typeLabel.setText("货物类型");
		            type.setBounds(120, 290, 150, 20);
		            estTimeLabel.setBounds(300, 290, 150, 20);
		            estTimeLabel.setText("预估时间");
		            estTime.setBounds(370, 290, 150, 20);
		    
		            sureButton.setBounds(450, 350, 70, 30);
		            sureButton.addActionListener(listener);
		            
		            addDlg.add(numbersLabel);
		            addDlg.add(numbers);
		            addDlg.add(senderLabel);
		            addDlg.add(sender);
		            addDlg.add(orderNumLabel);
		            addDlg.add(orderNum);
		            addDlg.add(ognizationLabel);
		            addDlg.add(ognization);
		            addDlg.add(senderTELLabel);
		            addDlg.add(senderTEL);
		            addDlg.add(senderPhoneLabel);
		            addDlg.add(senderPhone);
		            addDlg.add(receiverLabel);
		            addDlg.add(receiver);
		            addDlg.add(receiverPhoneLabel);
		            addDlg.add(receiverPhone);
		            addDlg.add(placeLabel);
		            addDlg.add(place);
		            addDlg.add(goodInfoLabel);
		            addDlg.add(goodInfo);
		            addDlg.add(estTimeLabel);
		            addDlg.add(estTime);
		            addDlg.add(costLabel);
		            addDlg.add(cost);
		            addDlg.add(typeLabel);
		            addDlg.add(type);
		            
		            
		            addDlg.add(sureButton);
		            
		            
		            addDlg.setLayout(null);
					addDlg.setVisible(true);
					
				}
				
			});
		}
		
		
		{/*for table*/
			Object[][] OrderInfo =
				{
					{"H12",  "123456789", "Tom", "12345678901",  "Jerry","13411111111" , 32.5, "特快"}
					
				};
			String[] names = {"营业厅编号", "订单号", "寄件人", "手机", "收件人","手机" ,"费用合计", "种类"};
			
			defaultTableModel = new DefaultTableModel(OrderInfo, names);
			table = new JTable(defaultTableModel );			//???
			Dimension size = table.getTableHeader().getPreferredSize();		//??
			
			size.height = 30;
			table.getTableHeader().setPreferredSize(size);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
			
			JScrollPane scrollPane = new JScrollPane(table);
			table.setRowHeight(25);
			scrollPane.setBounds(0, 0, 690, 420);
			this.add(scrollPane);
		}
		
	
	}
	
	ActionListener listener = new ActionListener(){

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Vector<String> row = new Vector<String>();
			row.add(numbers.getText());
			row.add(orderNum.getText());
			row.add(sender.getText());
			row.add(senderPhone.getText());
			row.add(receiver.getText());
			row.add(receiverPhone.getText());
			row.add(cost.getText());
			row.add(type.getText());
			defaultTableModel.addRow(row);
			 table.revalidate();
			 numbers.setText("");
			 orderNum.setText("");
			 ognization.setText("");
			 sender.setText("");
			 senderPhone.setText("");
			 senderTEL.setText("");
			 receiver.setText("");
			 receiverPhone.setText("");
			 place.setText("");
			 goodInfo.setText("");
			 cost.setText("");
			 type.setText("");
			 estTime.setText("");
			 

			 addDlg.dispose();
			 sureButton.removeActionListener(listener);
			 
	
		}
		
	};
}
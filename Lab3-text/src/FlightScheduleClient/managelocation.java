package FlightScheduleClient;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class managelocation extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public managelocation() {
		
		//JPanel
		//setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//资源显示面板
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(23, 142, 403, 111);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//标签：
		JLabel lblid = new JLabel("位置名称");
		lblid.setHorizontalAlignment(SwingConstants.CENTER);
		lblid.setBounds(23, 54, 97, 23);
		contentPane.add(lblid);
		
		//文本输入区
		textField_1 = new JTextField();
		textField_1.setBounds(130, 55, 211, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		//删除
		JButton btnNewButton_1 = new JButton("删除");
		btnNewButton_1.setBounds(352, 54, 74, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblid_1 = new JLabel("位置名称");
		lblid_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblid_1.setBounds(23, 95, 97, 23);
		contentPane.add(lblid_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(130, 96, 211, 22);
		contentPane.add(textField_2);
		
		JButton btnNewButton_1_1 = new JButton("增加");
		btnNewButton_1_1.setBounds(352, 95, 74, 23);
		contentPane.add(btnNewButton_1_1);
       }
}

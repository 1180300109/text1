package FlightScheduleClient;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class addplanningentry extends JFrame {

	private static final long serialVersionUID = 1158897003425269987L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_4;
	private JButton btnNewButton;

	public addplanningentry(String type) {
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		if(type == "flight")
		{
			JLabel lblNewLabel = new JLabel("计划项ID");
			lblNewLabel.setBounds(42, 13, 58, 15);
			contentPane.add(lblNewLabel);
			
			textField = new JTextField();
			textField.setBounds(124, 10, 187, 21);
			contentPane.add(textField);
			textField.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("起始位置");
			lblNewLabel_1.setBounds(42, 58, 58, 15);
			contentPane.add(lblNewLabel_1);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(124, 55, 187, 21);
			contentPane.add(textField_1);
			
			lblNewLabel_2 = new JLabel("终止位置");
			lblNewLabel_2.setBounds(42, 99, 58, 15);
			contentPane.add(lblNewLabel_2);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(124, 96, 187, 21);
			contentPane.add(textField_2);
			
			lblNewLabel_3 = new JLabel("起始时间 yyyy-MM-dd HH:mm ");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setBounds(10, 145, 186, 15);
			contentPane.add(lblNewLabel_3);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(218, 142, 187, 21);
			contentPane.add(textField_3);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(218, 183, 187, 21);
			contentPane.add(textField_4);
			
			lblNewLabel_4 = new JLabel("终止时间 yyyy-MM-dd HH:mm ");
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4.setBounds(10, 186, 186, 15);
			contentPane.add(lblNewLabel_4);
			
			btnNewButton = new JButton("确认");
			btnNewButton.setBounds(166, 230, 97, 23);
			contentPane.add(btnNewButton);
		}
	}
}

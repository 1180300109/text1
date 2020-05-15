package FlightScheduleClient;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;

public class operateentry extends JFrame {

	private static final long serialVersionUID = 3288282316184914817L;
	private JPanel contentPane;
	private JTextField textField;

	public operateentry() {

		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("计划项ID");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 17));
		lblNewLabel.setBounds(24, 38, 88, 32);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(138, 37, 256, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("操作");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(48, 147, 64, 24);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"启动", "阻塞", "取消", "结束"}));
		comboBox.setMaximumRowCount(4);
		comboBox.setBounds(138, 142, 107, 35);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("确认");
		btnNewButton.setBounds(282, 148, 88, 23);
		contentPane.add(btnNewButton);
		
		
	}
}

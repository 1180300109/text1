package FlightScheduleClient;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class manageplanningentry extends JFrame {

	private static final long serialVersionUID = 8991119573970253062L;
	private JPanel contentPane;
	
	public manageplanningentry(String type) {
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("增加计划项");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addplanningentry newpage = new addplanningentry(type);
				newpage.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 17));
		btnNewButton.setBounds(67, 10, 310, 55);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("分配资源");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allocate newpage = new allocate();
				newpage.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 17));
		btnNewButton_1.setBounds(67, 94, 310, 55);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("执行计划项");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operateentry newpage = new operateentry();
				newpage.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("宋体", Font.PLAIN, 17));
		btnNewButton_2.setBounds(67, 178, 310, 55);
		contentPane.add(btnNewButton_2);
		
	}

}

package FlightScheduleClient;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class flightgui extends JFrame {

	private static final long serialVersionUID = -4349966164977038635L;
	private JPanel contentPane;
	
	
	
	public flightgui(String type) {
		
		//JPanel
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//按钮类：如下
		JButton btnManageResource = new JButton("管理资源");
		//鼠标监听：如下
		btnManageResource.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{	
				manageresource newpage = new manageresource();
				newpage.setVisible(true);
			}
		});
		btnManageResource.setFont(new Font("宋体", Font.PLAIN, 15));
		btnManageResource.setBounds(30, 32, 171, 41);
		contentPane.add(btnManageResource);
		
		JButton btnManageLocation = new JButton("管理位置");
		btnManageLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				managelocation newpage = new managelocation();
				newpage.setVisible(true);
			}
		});
		btnManageLocation.setFont(new Font("宋体", Font.PLAIN, 15));
		btnManageLocation.setBounds(234, 32, 171, 41);
		contentPane.add(btnManageLocation);
		
		JButton btnBoard = new JButton("Board");
		btnBoard.setFont(new Font("宋体", Font.PLAIN, 15));
		btnBoard.setBounds(30, 187, 114, 41);
		contentPane.add(btnBoard);
		
		JButton btnApi = new JButton("API");
		btnApi.setFont(new Font("宋体", Font.PLAIN, 15));
		btnApi.setBounds(291, 187, 114, 41);
		contentPane.add(btnApi);
		
		JButton btnPlanningEntry = new JButton("计划项管理");
		btnPlanningEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manageplanningentry newpage = new manageplanningentry(type);
				newpage.setVisible(true);
			}
		});
		btnPlanningEntry.setFont(new Font("宋体", Font.PLAIN, 15));
		btnPlanningEntry.setBounds(30, 111, 375, 41);
		contentPane.add(btnPlanningEntry);
		
		JButton btnstate = new JButton("状态查询");
		btnstate.setFont(new Font("宋体", Font.PLAIN, 15));
		btnstate.setBounds(161, 187, 114, 41);
		contentPane.add(btnstate);
	}
	
}

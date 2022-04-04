import javax.swing.*;
import java.awt.*;


public class Display extends JFrame{
	JButton IP_dis = new JButton("IP计算工具");
	JButton IP2_dis = new JButton("网络划分工具");
	JLabel logo = new JLabel("Developer : Tiary");
	JLabel title1 = new JLabel("工具由Tiary个人开发，供同学们学习使用!");
	JLabel title2 = new JLabel("如发现软件存在错误,或者您有任何建议!");
	JLabel title3 = new JLabel("可以发送邮件到dengxiandong19@dnui.edu.cn反馈。");
	public Display(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(760, 600);
		setVisible(true);
		setResizable(false);

		Container cp = getContentPane();
		cp.setLayout(null);
		IP ip = new IP();
		ip.p.setVisible(false);
		cp.add(ip.p);
		IP2 ip2 = new IP2();
		ip2.p.setVisible(false);
		cp.add(ip2.p);

		cp.add(IP_dis);
		IP_dis.setBounds(20,130,150,100);
		IP_dis.setVisible(true);
		IP_dis.addActionListener((e)->{
			ip.p.setVisible(true);
			ip2.p.setVisible(false);
		});

		cp.add(IP2_dis);
		IP2_dis.setBounds(20,240,150,100);
		IP2_dis.setVisible(true);
		IP2_dis.addActionListener((e)->{
			ip.p.setVisible(false);
			ip2.p.setVisible(true);
		});


		cp.add(logo);
		logo.setBounds(20,400,150,30);
		cp.add(title1);
		cp.add(title2);
		cp.add(title3);

		title1.setBounds(300,200,500,30);
		title2.setBounds(310,230,500,30);
		title3.setBounds(270,260,500,30);
//计算***********************************************************

//*************************************************
		
		

	}
}
